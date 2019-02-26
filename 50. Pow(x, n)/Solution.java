// Matthew Clark
// LeetCode 50. Pow(x, n) (Medium)
// Runtime 0.83%

class Solution
{
    public static void main(String[] args)
    {
        double x = 1.5;
        int n = 2;
        double power = myPow(x, n);
        System.out.println(power);
    }

    public static double myPow(double x, int n) {
        if(n == 0) return 1.0;
        double d = myPow(x, n/2);
        System.out.println("d: " + d);
        if(n%2 == 0)
        {
            System.out.println(1);
            return d*d;

        }
        if(n < 0)
        {
            System.out.println(2);
            return d*d*(1/x);
        }
        return d*d*x;
    }

}