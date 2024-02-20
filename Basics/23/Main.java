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
        char[] hexAl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte i = 0;

        // Take input
        System.out.print("Input Binary Number: ");
        binNum = scanner.nextLong();

        // Convert bin to dec
        while (binNum != 0){
            dec += binNum % 2 * Math.pow(2, i++);
            binNum /= 10;
        }

        i = 0;

        // Convert decimal to hex
        while (dec != 0){
            hex[i++] = hexAl[dec % 16];
            dec /= 16; 
        }

        System.out.print("Hexadecimal Number: ");
        i--;
        while (i>=0){
            System.out.print(hex[i--]);
        }

        scanner.close();
    }
}