/* 22. Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4  */

import java.util.Scanner;

public class Zadanie22{
    public static void main(String[] args) {
        long binNum = 0;
        Scanner scanner = new Scanner(System.in);
        byte factor = 0;
        int decNum = 0;

        System.out.print("Input binary number: ");
        binNum = scanner.nextLong();

        while(binNum > 0){
            decNum += (binNum % 2) * Math.pow(2, factor);
            binNum /= 10;
            factor++;
        }

        System.out.println("Converted decimal number is: " + decNum);

        scanner.close();
        return;
    }
}