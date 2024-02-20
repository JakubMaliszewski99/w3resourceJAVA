import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /* 23. Write a Java program to convert a binary number to a hexadecimal number.
        Input Data:
        Input a Binary Number: 1101
        Expected Output

        HexaDecimal value: D */

        // Variables
        Scanner scanner = new Scanner(System.in);

        long binNum = 0;
        int dec = 0;
        char[] hex = new char[20];
        int hexLength = 0;

        // Take input
        System.out.print("Input Binary Number: ");
        binNum = scanner.nextLong();

        // Convert bin to dec
        dec = Conversions.convBin2Dec(binNum);

        // Convert decimal to hex (you get the digits in a reversed order)
        hex = Conversions.convDec2Hex(dec);

        for (int j = 0; hex[j] != 0; j++){
            hexLength++;
        }

        System.out.print("Hexadecimal Number: ");
        for (int i = hexLength; i >= 0; i--){
        System.out.print(hex[i]);
        }
        scanner.close();
    }
}