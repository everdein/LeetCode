// Matthew Clark
// LeetCode 13. Roman to Integer (Easy)
// Runtime 39,32%

import java.util.Scanner;
import java.util.HashMap;

class Solution
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a roman numeral: ");
        String s = console.next();
        int number = romanToInt(s);
        System.out.println("The roman numeral entered is " + number + ".");
        console.close();
    }
    public static int romanToInt(String s)
    {
        if (s == null || s.length() == 0)
        {
            return 0;
        }

        HashMap<Character, Integer> HashMap = new HashMap<Character, Integer>();
        HashMap.put('I', 1);
        HashMap.put('V', 5);
        HashMap.put('X', 10);
        HashMap.put('L', 50);
        HashMap.put('C', 100);
        HashMap.put('D', 500);
        HashMap.put('M', 1000);

        int number = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(i <= s.length() - 2 && HashMap.get(s.charAt(i)) < HashMap.get(s.charAt(i + 1)))
            {
                number -= HashMap.get(s.charAt(i));
            }
            else
            {
                number += HashMap.get(s.charAt(i));
            }
        }
        return number;
    }
}
