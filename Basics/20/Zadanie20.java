import java.util.Scanner;

public class Zadanie20{
    public static void main(String[] args) {
        int decNum;
        int i = 0;
        char[] hexNum = new char[20];
        char[] hexNums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Decimal number: ");
        decNum = scanner.nextInt();

        while (decNum != 0){
            hexNum[i++] = hexNums[(decNum % 16)];
            decNum /= 16;
        }
        i--;
        System.out.print("Hexadecimal number is: ");
        while(i>=0){
            System.out.print(hexNum[i--]);
        }

        scanner.close();
    }
}