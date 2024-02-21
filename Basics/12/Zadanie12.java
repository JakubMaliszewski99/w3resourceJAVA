import java.util.Scanner;

public class Zadanie12{
    public static void main(String[] args) {
        double num1, num2, num3;
        double avr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 3 numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        
        avr = (num1 + num2 + num3) / 3;

        System.out.println("The average of the given numbers is: " + avr);

        scanner.close();
    }
}

