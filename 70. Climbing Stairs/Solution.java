// Matthew Clark
// LeetCode 70. Climbing Stairs (Easy)
// Runtime 90.51%

class Solution
{
    public static void main(String[] args)
    {
        int n = 6;
        System.out.println(climbingStairs(n));
    }

    // public static int climbingStairs(int n) 
    // {
    //     int prepre = 0
    //     int pre = 1;
    //     for (int i = 0; i < n; i ++) 
    //     {
    //         int temp = prepre + pre;
    //         prepre = pre;
    //         pre = temp;
    //     }
    //     return pre;
    // } // climb

    public static int climbingStairs(int n) 
    {
        if (n == 1)
        {
            return 1;
        }
        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            ways[i] = ways[i - 1] + ways[i - 2];
        } //for
        return ways[n];
    } // Climb
}