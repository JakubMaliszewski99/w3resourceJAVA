/* 35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double area = 0;
        double sideLength = 0;
        int nrOfSides = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the number of sides of the polygon: ");
        nrOfSides = in.nextInt();

        System.out.print("Input the length of one of the sides: ");
        sideLength = in.nextDouble();

        area = (nrOfSides * sideLength * sideLength) / (4 * Math.tan(Math.PI/nrOfSides));

        System.out.println("The area is: " + area);
        in.close();
    }
}

