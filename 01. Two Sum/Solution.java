// Matthew Clark
// LeetCode 07. Reverse Integer (Easy)
// Runtime 43.77%

class Solution
{
    // Main method passes array of integers and target integer 
    // to the two sum method, and is checks the array to see if 
    // there are two integers that add up to the target integer.
    public static void main(String[] args)
    {
        // Declares array of integers.
        int[] nums = {2, 7, 11, 15};
        // Declares integer.
        int target = 9;
        // Passes array and integer to two sum and stores the result in sum.
        int[] sum = twoSum(nums, target);
        // 
        for (int i = 0; i < sum.length; i++)
        {
            System.out.println(sum[i]);
        }
        
    }
    
    // Method checks array of integers to see if there are two
    // integers that add up to the target integer.
    public static int[] twoSum(int[] nums, int target)
    {
        // Cycles through array of integers.
        for (int i = 0; i < nums.length; i++)
        {
            // Cycles through array of integers a second time.
            for (int j = i + 1; j < nums.length; j++)
            {
                // Compares first integer of array to target integer 
                // minues the next integer of array.
                if (nums[j] == target - nums[i])
                {
                    // When two integers are found that equal target
                    // integer the index of both numbers is returned.
                    return new int[] {i, j};
                }
            }
        }
        // In the event there's no solution an illegal argument exception is made.
        throw new IllegalArgumentException("No two sum solution");
    }
}