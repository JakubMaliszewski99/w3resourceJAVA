/*32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        System.out.print("Input number 1: ");
        num1 = in.nextInt();
        System.out.print("Input number 2: ");
        num2 = in.nextInt();

        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }
        else{
            System.out.println(num1 + " != " + num2);
            if(num1 > num2){
                System.out.println(num1 + " > " + num2);
                System.out.println(num1 + " >= " + num2);
            }
            else{
                System.out.println(num1 + " < " + num2);
                System.out.println(num1 + " <= " + num2);
            }
        }

        in.close();
    }
}