// Matthew Clark
// LeetCode 66. Plus One (Easy)
// Runtime 100.00% 

class Solution
{
    public static void main(String[] args)
    {
        int[] digits = {9, 9, 9, 9};
        int[] newDigits = plusOne(digits);
        for(int i = 0; i < newDigits.length; i++)
        {
            System.out.print(newDigits[i]);
        }
        System.out.println();
    }

    public static int[] plusOne(int[] digits) 
    {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) 
        {
            if (digits[i] == 9) 
            {
                digits[i] = 0;
            } 
            else 
            {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;
        for (int j = 1; j <= len; j++) 
        {
            newDigits[j] = digits[j - 1];
        }
        return newDigits;
    }
}