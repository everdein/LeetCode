// Matthew Clark
// LeetCode 35. Search Insert Position (Easy)
// Runtime 99.97%

class Solution
{
    public static void main(String[] args)
    {
        int nums[] = {1, 3, 5, 6, 8, 9, 10};
        int target = 1;
        int output = searchInsert(nums, target);
        System.out.println(output);
    }

    public static int searchInsert(int[] nums, int target)
    {
        int low = 0, high = nums.length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (nums[mid] == target) 
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
}