import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: "); 
        
        int num = scanner.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}