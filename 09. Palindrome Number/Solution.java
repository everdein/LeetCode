// Matthew Clark
// LeetCode 09. Palindrome Number (Easy)
// Runtime 55.63%

// Imports java utility scanner to allow user input.
import java.util.Scanner;

class Solution
{
    public static void main(String[] args)
    {
        // Opens scanner console.
        Scanner console = new Scanner(System.in);
        // Prompts user to enter a palindrome number.
        System.out.print("Please input a palindrome number: ");
        // Accepts user input.
        int x = console.nextInt();
        // Passes user input to isPalindrome method.
        boolean decision = isPalindrome(x);
        // Prints boolean decision of user input.
        System.out.println(decision);
        // Closes scanner console.
        console.close();
    }

    public static boolean isPalindrome(int x)
    {
        // Stores user input into variable y.
        int y = x;
        // Long is used to handle larger integers.
        long reversedInteger = 0;
        // Reverses integer.
        while (y != 0) {
            reversedInteger = reversedInteger * 10 + y % 10;
            y = y / 10;
        }
        // Checks to see if the reversed integer is negative.
        if (reversedInteger < 0)
        {
            return false;
        }
        // Checks to see if the reversed integer equals user input.
        if (reversedInteger == x)
        {
            return true;
        }
        // If the reversed integer doesn't equal user input return false.
        else
        {
            return false;
        }
    }
}