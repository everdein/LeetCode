// Matthew Clark
// LeetCode 204. Count Primes (Easy)
// Runtime 

public class Solution
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n)
    {
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                
                count++;
            }

        }
        if(count <= 2)
        {
            System.out.println(i);
        }
        return 0;
    }
}