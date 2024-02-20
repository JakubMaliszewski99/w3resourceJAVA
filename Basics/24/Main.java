import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*24. Write a Java program to convert a binary number to an octal number.
        Input Data:
        Input a Binary Number: 111
        Expected Output

        Octal number: 7  */
        // Variables
        Scanner scanner = new Scanner(System.in);

        long binNum = 0;
        int dec = 0;
        byte[] oct = new byte[20];
        int octLength = 0;

        // Take input
        System.out.print("Input Binary Number: ");
        binNum = scanner.nextLong();

        // Convert bin to dec
        dec = Conversions.convBin2Dec(binNum);

        // Convert decimal to oct (you get the digits in a reversed order)
        oct = Conversions.convDec2Oct(dec);

        for (int j = 0; oct[j] != 0; j++){
            octLength++;
        }

        System.out.print("Octal Number: ");
        for (int i = octLength; i >= 0; i--){
        System.out.print(oct[i]);
        }
        scanner.close();


    }
}