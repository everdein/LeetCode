// Matthew Clark
// LeetCode 709. To Lower Case (Easy)
// Runtime 38.91%

// Imports java utility scanner to allow user input.
import java.util.Scanner;

class Solution
{
    // Main method passes user input toLowerCase method
    // and is converted from upper case to lower case.
    public static void main(String[] args)
    {
        // Opens scanner console.
        Scanner console = new Scanner(System.in);
        // Prompts user to enter a string.
        System.out.println("Enter a string: ");
        // Accepts user input.
        String str = console.next();
        // Passes user input.
        String lowerCase = toLowerCase(str);
        // Prints converted string.
        System.out.println(lowerCase);
        // Closes scanner console.
        console.close();
    }

    // Method converts string to lower case and returns it
    // to main method.
    public static String toLowerCase(String str)
    {
        // Converts string to lower case.
        String lowerCase = str.toLowerCase();
        // Returns converted string.
        return lowerCase;
    }
}