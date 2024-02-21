import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        /*26. Write a Java program to convert a octal number to a binary number.
        Input Data:
        Input any octal number: 7
        Expected Output

        Equivalent binary number: 111  */

        Scanner in = new Scanner(System.in);
        int octal = 0;
        int dec = 0;
        byte i = 0;
        byte[] bin = new byte[20];

        System.out.print("Input an octal number: ");
        octal = in.nextInt();

        //Konwersja na decymalne
        while(octal>0){
            dec += (octal%10) * Math.pow(8, i);
            octal /= 8;
            i++;
        }

        System.out.println("Equivalent decimal number: " + dec);

        //Konwersja na binarne
        i = 0;
        while(dec>0){
            bin[i] = (byte)(dec % 2);
            dec /= 2;
            i++;
        }
        i--;
        
        System.out.print("Equivalent binary number: ");
        while(i>=0){
            System.out.print(bin[i--]);
        }

        in.close();
    }
}