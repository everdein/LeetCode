// Matthew Clark
// LeetCode 27. Remove Element (Easy)
// Runtime 99.85%

class Solution
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 2, 3, 5};
        int val = 3;
        
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
        System.out.println();

        int count = removeElement(nums, val);
        System.out.println(count);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        
    }
    public static int removeElement(int[] nums, int val)
    {
        if(nums.length == 0)
        {
            return 0;
        }   
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[i] = nums[count];
                count++;
            }
        }
        return count;
    }
}