// Matthew Clark
// LeetCode 53. Maximum Subarray (Easy)
// Runtime 28.90%

class Solution
{
	public static void main(String[] args)
	{
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);
        System.out.println("The maximum subarray is " + max + ".");
    }

	public static int maxSubArray(int[] nums)
	{
		int newsum=nums[0];
		int max=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			// System.out.println("Nums[i]: " + nums[i]);
			newsum=Math.max(newsum+nums[i],nums[i]);
			// System.out.println("New Sum: " + newsum);
			max= Math.max(max, newsum);
			// System.out.println("Max: " + max);
		}
		return max;
    }
}