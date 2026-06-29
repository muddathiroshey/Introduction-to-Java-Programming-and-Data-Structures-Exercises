/*
 * Exercise 3.5: Find Future Dates
 *
 * Prompt user for today's day of week (0 for Sun, 1 for Mon, ..., 6 for Sat) and elapsed days, then print today's day and the future day of the week. The class name must be Exercise03_05.

 * Sample Input:
 *   1 3

 * Expected Output:
 *   Today is Monday and the future day is Thursday
 */
import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Note 0 is Sunday, 1 for Monday and so on " +
                "Please enter the integer of the day :");
        int today = input.nextInt();

        System.out.println("Please enter number of day elapsed since today");

        int elapsedDays = input.nextInt();
        int futureElapsedDay = (today + elapsedDays) % 7;

        String[] daysOfWeek = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        if (today > 6 || today < 0) {
            System.out.println("Please provide day number between 0 and 6");
        } else {
            System.out.println("Today is :" + daysOfWeek[today] + " and future day is :" + daysOfWeek[futureElapsedDay]);
        }
        
    }
}