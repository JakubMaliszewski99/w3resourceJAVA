import java.util.Scanner;

public class Zadanie21{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int decNum = 0;
        byte[] octNum = new byte[20];
        int i = 0;

        System.out.print("Decimal number to convert: ");
        decNum = scanner.nextInt();

        while (decNum > 0){
            octNum[i++] = (byte) (decNum % 8);
            decNum /= 8;
        }

        while (i > 0){
            System.out.print(octNum[--i]);
        }

        scanner.close();
        return;
    }
}