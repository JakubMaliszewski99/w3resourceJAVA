/*33. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int result = 0;

        number = in.nextInt();
        
        while (number > 0){
            result += number%10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + result);

        in.close();
    }
}