// Matthew Clark
// LeetCode 69. Sqrt(x) (Easy)
// Runtime 79.81%

class Solution
{
    public static void main(String[] args)
    {
        int x = 8;
        // int result = mySqrt(x);
        // System.out.println(result);
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x)
    {
        if (x < 0)
        {
            return (int)Double.NaN;
        }
        double err = 1e-15;
        double t = x;
        while (Math.abs(t - x/t) > err * t)
        {
            t = (x/t + t) / 2.0;
        }
        return (int)t;
    }

    // Runtime is too long.
    // public static int mySqrt(int x)
    // {
    //     if (x == 0 || x == 1) 
    //     {
    //         return x; 
    //     }
    //     int start = 1, end = x, ans = 0; 
    //     while (start <= end) 
    //     { 
    //         int mid = (start + end) / 2; 
    //         if (mid*mid == x) 
    //         {
    //             return mid; 
    //         }
    //         if (mid*mid < x) 
    //         { 
    //             start = mid + 1; 
    //             ans = mid; 
    //         } 
    //         else
    //         {
    //            end = mid-1; 
    //         }
    //     } 
    //     return ans; 
    // }

    // Doesn't work in all cases.
    // static int mySqrt(int x) 
    // { 
    //     // Base cases 
    //     if (x == 0 || x == 1) 
    //         return x; 
  
    //     // Staring from 1, try all numbers until 
    //     // i*i is greater than or equal to x. 
    //     int i = 1, result = 1; 
          
    //     while (result <= x) { 
    //         i++; 
    //         result = i * i; 
    //     } 
    //     return i - 1; 
    // } 

}