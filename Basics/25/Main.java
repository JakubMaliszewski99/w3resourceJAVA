import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        /*25. Write a Java program to convert a octal number to a decimal number.
        Input Data:
        Input any octal number: 10
        Expected Output

        Equivalent decimal number: 8 */

        Scanner in = new Scanner(System.in);
        int octal = 0;
        int dec = 0;
        byte i = 0;

        System.out.print("Input an octal number: ");
        octal = in.nextInt();

        while (octal>0){
            dec += (octal%10) * Math.pow(8, i);
            octal /= 8;
            i++;
        }

        System.out.println("Equivalent decimal number: " + dec);
        in.close();
    }
}