// Matthew Clark
// LeetCode 14. Longest Common Prefix (Easy)
// Runtime 100.00%

class Solution
{
    public static void main(String[] args)
    {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
    public static String longestCommonPrefix(String[] strs)
    {
        if(strs.length == 0)
        {
            return "";
        }
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
}