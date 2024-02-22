/*38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int letters = 0, spaces = 0, numbers = 0, others = 0;
        String s;

        System.out.print("The string is: ");
        s = in.nextLine();

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) >= '0' && s.charAt(i) <='9') numbers++;
            else if(s.charAt(i) == ' ') spaces++;
            else if((s.charAt(i)>= 'a' && s.charAt(i)<='z') || (s.charAt(i)>= 'A' && s.charAt(i)<='Z')) letters++;
            else others++;
        }

        System.out.println("letters: " + letters);
        System.out.println("spaces: " + spaces);
        System.out.println("numbers: " + numbers);
        System.out.println("others: " + others);
        
        in.close();
        }
}