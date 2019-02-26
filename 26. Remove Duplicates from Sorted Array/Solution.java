// Matthew Clark
// LeetCode 26. Remove Duplicates from Sorted Array (Easy)
// Runtime 90.91%

class Solution
{
    public static void main(String[] args)
    {
        int[] nums = {1, 1, 3};
        // int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int output = removeDuplicates(nums);
        System.out.println(output);

    }
    
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 0)
        {
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++)
        {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}