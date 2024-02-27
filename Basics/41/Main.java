import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char character;

        System.out.print("Enter a character: ");

        character = in.next().charAt(0);

        int asciiValue = (int) character;

        System.out.println(asciiValue);

        in.close();
    }
    
}
