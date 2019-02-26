// Matthew Clark
// LeetCode 7. Reverse Integer (Easy)
// Runtime 75.29%

// Imports java utility scanner to allow user input.
import java.util.Scanner;

class Solution
{
    /* Main method passes user input to reverse method.
       Upon return reversed integer is printed. */
    public static void main(String[] args)
    {
        // Opens scanner console.
        Scanner console = new Scanner(System.in);
        // Prompts user to enter an integer.
        System.out.print("Enter a number to be reversed: ");
        // Accepts user input.
        int x = console.nextInt();
        // Passes user input to reverse method.
        int reversedInteger = reverse(x);
        // Prints reversed integer.
        System.out.println("Reversed number is " + reversedInteger + ".");
        // Closes scanner console.
        console.close();
    }

    // Reverses integer and passes back to main method for output.
    public static int reverse(int x)
    {
        // Long is used to handle larger integers.
        long reversedInteger = 0;
        // Reverses integer.
        while (x != 0) {
            reversedInteger = reversedInteger * 10 + x % 10;
            x = x / 10;
        }
        // Returns 0 if x is out of scope.
        if (reversedInteger > Integer.MAX_VALUE || reversedInteger < Integer.MIN_VALUE)
        {
            // Throws illegal argument exception if integer is not in scope.
            // throw new IllegalArgumentException();
            return 0;
        }
        // Returns reversed integer if x is in scope of long.
        return (int) reversedInteger;
    }
}