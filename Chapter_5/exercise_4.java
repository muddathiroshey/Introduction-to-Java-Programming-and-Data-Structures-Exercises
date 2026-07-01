/*
 * Exercise 5.4: Conversion Miles to Kilometers
 *
 * Write a loop to display a table of conversions from miles (1 to 10) to kilometers (1 mile = 1.609 km). The class name must be Exercise05_04.

 * Expected Output:
 *   10      16.09
 */
public class Exercise05_04 {
    public static void main(String[] args) {
        // Display conversion table
         double oneMile = 1.609;

        System.out.println("Miles" + "          " + "Kilometers");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "          " + String.format("%.3f", i*oneMile));
        }
    }
}