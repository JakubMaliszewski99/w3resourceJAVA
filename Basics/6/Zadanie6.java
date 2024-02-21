import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " X " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);

        scanner.close();
    }
}