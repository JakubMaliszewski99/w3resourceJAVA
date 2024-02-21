import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*30. Write a Java program to convert a hexadecimal value into an octal number.
        Input Data:
        Input a hexadecimal number: 40
        Expected Output

        Equivalent of octal number is: 100*/
        // Declare variables to store octal number and its decimal and hexadecimal equivalents
        String hex ="";
        int decnum = 0;
        byte[] octNum = new byte[20];
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input an hex number
        System.out.print("Input a hexadecimal number : ");
        hex = in.nextLine();
        
        // Convert the hexadecimal number to its decimal equivalent using a hex2dec method
        decnum = hex2dec(hex);
        
        // Display the equivalent decimal number
        System.out.print("Equivalent decimal number: " + decnum + "\n");

        // Convert the decimal number to its octal equivalent
        byte i = 0;
        while(decnum > 0){
            octNum[i++] = (byte)(decnum % 8);
            decnum /= 8;
        }

        i--;
        // Display the equivalent octal number
        System.out.print("Equivalent octal number: ");
        // Display the equivalent octal number
        while(i >= 0){
            System.out.print(octNum[i--]);
        }
        in.close();
    }

    public static int hex2dec(String hex){
        String hexAlf = "0123456789ABCDEF";
        int dec = 0;
        int currval = 0;
        char curr = '0';
        hex = hex.toUpperCase();

        for (int i = 0; i < hex.length(); i++ ){
            curr = hex.charAt(i);
            currval = hexAlf.indexOf(curr);
            dec = dec * 16 + currval;
        }

        return dec;
    }
}