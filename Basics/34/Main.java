/*34. Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double area = 0;
        double sideLength = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input the length of a side of the hexagon: ");
        sideLength = in.nextDouble();

        area = (6 * Math.pow(sideLength, 2))/(4*Math.tan(Math.PI/6));

        System.out.println("The area of the hexagon is: " + area);

        in.close();
    }
}