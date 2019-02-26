// Matthew Clark
// LeetCode 28. Implement strStr() (Easy)
// Runtime 25.40%

class Solution
{
    public static void main(String[] args)
    {
        String haystack = "hello";
        String needle = "ll";
        int output = strStr(haystack, needle);
        System.out.println(output);
    }
    public static int strStr(String haystack, String needle)
    {
        // Checks to see if hastack and needle are null.
        if(haystack == null || needle == null)
        {
            return 0;
        }
        // Checks to see if needle length equals 0.
        if(needle.length() == 0)
        {
            return 0;
        }

        // Iterates through haystack length.
        for(int i = 0; i < haystack.length(); i++)
        {
            // If needle is greater than haystack return -1.
            if(i + needle.length() > haystack.length())
            {
                return -1;
            }
            int m = i;
            // Iterates through needle length.
            for(int j = 0; j < needle.length(); j++)
            {
                // Compare needle index to haystack index.
                if(needle.charAt(j) == haystack.charAt(m))
                {
                    // If needle index equals needle length -1 return index.
                    if(j == needle.length() - 1)
                    {
                        return i;
                    }
                    m++;
                }
                else
                {
                    break;
                }
            }
        }
        return -1;
    }
}