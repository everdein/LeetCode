// Matthew Clark
// LeetCode 38. Count and Say
// Runtime 43.42%


// The following are the terms from n=1 to n=10 of the count-and-say sequence:
//  1.     1
//  2.     11
//  3.     21
//  4.     1211
//  5.     111221 
//  6.     312211
//  7.     13112221
//  8.     1113213211
//  9.     31131211131221
// 10.     13211311123113112211

class Solution
{
    public static void main(String[] args)
    {
        int n = 3;
        String output = countAndSay(n);
        System.out.println("Output: " + output);
    }
    public static String countAndSay(int n)
    {
        if(n <= 0)  return null;
        if(n == 1)  return "1";

        StringBuffer sb = new StringBuffer("11");
        for(int i = 2; i < n; i++)
        {
            StringBuffer c = new StringBuffer();
            int count = 1;
            for(int j = 1; j < sb.length(); j++)
            {
                if(sb.charAt(j - 1) == sb.charAt(j))
                {
                    count++;
                }
                else
                {
                    c.append(count);
                    c.append(sb.charAt(j - 1));
                    count = 1;
                }
            }
            c.append(count);
            c.append(sb.charAt(sb.length() - 1));
            sb = c;
        }
        return sb.toString();
    }
}