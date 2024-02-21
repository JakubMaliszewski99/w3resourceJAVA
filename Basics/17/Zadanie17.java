import java.util.Scanner;

public class Zadanie17{
    public static void main(String[] args) {
        long bin1, bin2;
        byte i = 0;
        byte remainder = 0;
        byte[] sum = new byte[20];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 2 binary numbers: ");
        bin1 = scanner.nextLong();
        bin2 = scanner.nextLong();
        
        while(bin1 != 0 || bin2 != 0){
            sum[i++] = (byte)((bin1%2 + bin2%2 + remainder) % 2);
            remainder = (byte)((bin1%2 + bin2%2 + remainder) / 2);
            bin1 /= 10;
            bin2 /= 10;
        }

        if(remainder != 0){
            sum[i++] = remainder;
        }

        i--;

        System.out.print("Result: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }

        scanner.close();
    }
}