/*
 * Exercise 4.5: Area of Regular Polygon
 *
 * Read number of sides 'n' and side length 's' from user. Area = (n * s^2) / (4 * tan(PI / n)). The class name must be Exercise04_05.

 * Sample Input:
 *   5 6

 * Expected Output:
 *   Area: 61.937
 */
import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read n and s, print area
         System.out.println("Enter the number of sides: ");
        int numberOfSize = input.nextInt();

        System.out.println("Enter the number of sides: ");
        double side = input.nextDouble();

        double area = (numberOfSize * Math.pow(side , 2)) / (4 * Math.tan(Math.PI/numberOfSize));
        System.out.println("The area of the polygon is " + area);
    }
}