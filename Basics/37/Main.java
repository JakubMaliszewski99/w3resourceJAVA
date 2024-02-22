/*37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String s = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        s = in.nextLine();

        System.out.print("Reverse string: ");
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }

        in.close();
    }
}