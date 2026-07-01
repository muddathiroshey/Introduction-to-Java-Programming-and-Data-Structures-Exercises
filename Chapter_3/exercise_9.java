/*
 * Exercise 3.9: Business Check ISBN-10
 *
 * Read the first 9 digits of an ISBN. Compute the checksum: (d1 * 1 + d2 * 2 + ... + d9 * 9) % 11. If the checksum is 10, the last digit is 'X'. Print the full 10-digit ISBN. The class name must be Exercise03_09.

 * Sample Input:
 *   013031997

 * Expected Output:
 *   013031997X
 */
import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read 9 digits, print 10-digit ISBN
         System.out.println("Please enter the first 9 digit of the an ISBN integer: ");
        int firstNineDigit = input.nextInt();

        int dOne = firstNineDigit / 1_0000_0000;
        int dTwo = (firstNineDigit / 1000_0000) % 10;
        int dThree = (firstNineDigit / 1000_000) % 10;
        int dFour = (firstNineDigit / 100_000) % 10;
        int dFive = (firstNineDigit / 100_00) % 10;
        int dSix = (firstNineDigit / 1000) % 10;
        int dSeven = (firstNineDigit / 100) % 10;
        int dEight = (firstNineDigit / 10) % 10;
        int dNine = firstNineDigit % 10;

        int lastDigitOfIsbn = (dOne * 1 +
                dTwo * 2 +
                dThree * 3 +
                dFour * 4 +
                dFive * 5 +
                dSix * 6 +
                dSeven * 7 +
                dEight * 8 +
                dNine * 9) % 11;
        if (lastDigitOfIsbn == 10)
            System.out.println("The ISBN number is " + firstNineDigit + "X");
        else
            System.out.println("The ISBN number is " + firstNineDigit + lastDigitOfIsbn);
    }
}