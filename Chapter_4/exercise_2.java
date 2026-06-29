/*
 * Exercise 4.2: Great Circle Distance
 *
 * Read latitude/longitude of point 1 and point 2, then compute the great circle distance using Math trig functions. The class name must be Exercise04_02.

 * Sample Input:
 *   39.55 -8.66 41.51 -8.22

 * Expected Output:
 *   Distance: 218.
 */
import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write Great Circle distance calculation here
         final double RADIUSOFEARTH = 6371.01;

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        double x1, y1, x2, y2;
        x1 = Math.toRadians(latitude1);
        y1 = Math.toRadians(longitude1);
        x2 = Math.toRadians(latitude2);
        y2 = Math.toRadians(longitude2);

        double d = RADIUSOFEARTH * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 -y2));

        System.out.println("The distance between the two points is " + d);
    }
}