// Matthew Clark
// LeetCode 771. Jewels and Stones (Easy)
// Runtime 91.06%

class Solution
{
    public void main(String[] args)
    {
        String J = "aA";
        String S = "aAAbbbb";
        int count = numJewelsInStones(J, S);
        System.out.println(count);
    }

    public int numJewelsInStones(String J, String S)
    {
        int count = 0;
        for(int i = 0; i < J.length(); i++)
        {
            for(int j = 0; j < S.length(); j++)
            {
                if(J.charAt(i) == S.charAt(j))
                {
                    count++;
                }
            }
        }
        return count;
    }
}