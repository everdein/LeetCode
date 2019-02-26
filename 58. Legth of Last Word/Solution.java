// Matthew Clark
// LeetCode 58. Length of Last Word (Easy)
// Runtime 54.38%

class Solution
{
    public static void main(String[] args)
    {
        String s = "Welcome to the jungle";
        int word = lengthOfLastWord(s);
        System.out.println(word);
    }

    public static int lengthOfLastWord(String s) 
    { 
        if(s == null || s.length() == 0)
        {
            return 0;
        }
        int result = 0;
        boolean flag = false;
        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                flag = true;
                result++;
            }
            else
            {
                if(flag)
                {
                    return result;
                }
            }
        }
        return result;
    }

    // public static int lengthOfLastWord(String s) {
    //     if (s == null)
    //     {
    //         return 0;
    //     }
    //     int i = s.lastIndexOf(' ') + 1;
    //     return s.length() - i;
    // }
}