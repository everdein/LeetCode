// Matthew Clark
// LeetCode 20. Valid Parentheses (Easy)
// Runtime 32.54%

// Imports Scanner.
import java.util.Scanner;
// Imports data structure Hashmap
import java.util.HashMap;
// Imports data structure Stack
import java.util.Stack;

// Creates ValidParentheses class.
class Solution
{
    // Main method requests brackets from user and calls isValid method to
    // validate brackets. Then prints out the boolean return.
    public static void main(String[] args)
    {
        // Creates scanner to accept user input.
        Scanner console = new Scanner(System.in);
        // Asks the user to enter a series of brackets.
        System.out.print("Please enter a series of brackets: ");
        // Stores users input.
        String s = console.nextLine();
        // Passes users unput to isValid method and stores the boolean.
        Boolean parentheses = isValid(s);
        // Prints boolean.
        System.out.println(parentheses);
        // Closes scanner.
        console.close();
    }

    // Validates open and closed brackets entered by user.
    public static boolean isValid(String s)
    {
        // Creates dats structure HashMap.
        HashMap<Character, Character> HashMap = new HashMap<Character, Character>();
        // Adds brackets to HashMap.
        HashMap.put('(', ')');
        HashMap.put('[', ']');
        HashMap.put('{', '}');
        // Creates data structure Stack.
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            // Stores character.
            char current = s.charAt(i);
            // Checks to see if the HashMap keyset contains current character.
            if(HashMap.keySet().contains(current))
            {
                // Pushes current character to Stack.
                stack.push(current);
            }
            // Checks to see if the HashMap values contains current character.
            else if(HashMap.values().contains(current))
            {
                // Checks if Stack isn't empty and HashMap contains character 
                // which equals current character.
                if(!stack.empty() && HashMap.get(stack.peek()) == current)
                {
                    // Pops current character from stack.
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        // Returns empty stack.
        return stack.empty();
    }
}