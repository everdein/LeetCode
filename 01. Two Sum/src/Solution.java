// Matthew Clark
// LeetCode 07. Reverse Integer (Easy)
// Runtime 43.77%

import java.util.Map;
import java.util.HashMap;

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
        int target = 26;
        // Passes array and integer to two sum and stores the result in sum.
        int[] sum = twoSum(nums, target);
        // 
        for (int i = 0; i < sum.length; i++)
        {
            System.out.print(sum[i] + " ");
        }
    }
    
    // Method checks array of integers to see if there are two
    // integers that add up to the target integer.
    public static int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}