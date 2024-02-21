import java.util.Scanner;

public class Zadanie19{
    public static void main(String[] args) {
        //Convert decimal to binary
        int decNum;
        byte[] binNum = new byte[20];
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        decNum = scanner.nextInt();

        while(decNum != 0){
            binNum[i++] = (byte)(decNum % 2);
            decNum /= 2;
        }
        i--;
        System.out.print("Binary representation: ");
        while(i>=0){
            System.out.print(binNum[i--]);
        }

        scanner.close();
    }
}