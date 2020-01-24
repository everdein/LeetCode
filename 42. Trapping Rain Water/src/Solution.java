// Matthew Clark
// LeetCode 42. Trapping Rain Water (Hard)
// Runtime

// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it is able to trap after raining.

public class Solution
{
    public static void main(String[] args)
    {
//        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int[] height = {0, 1, 0, 2, 1, 4, 2, 1, 0};
//        int[] increasing = {0, 1, 2, 3, 4};
//        int[] decreasing = {4, 3, 2, 1, 0};
//        int[] mountain = {0, 1, 2, 3, 3, 2, 1, 0};
        int[] mountain = {0, 1, 2, 3, 1, 3, 2, 1, 0};

//        int result1 = trap(increasing);
//        int result2 = trap(decreasing);
        int result3 = trap(mountain);
//        System.out.println(result1 + ", " + result2 + ", " + result3);
        System.out.println(result3);
    }

    public static int trap(int[] height)
    {
        int result = 0;

        int newLeft = 0;
        int newRight = 0;

        int left = 0;
        int right = 1;

        if(height.length == 0){ return 0; }

        // Checks if array only increases from left to right
        while(height[left] <= height[right])
        {
            if(right >= left)
            {
                newLeft = right;
                System.out.println("newLeft: " + newLeft + " value: " + height[newLeft]);
            }
            if(height[left] <= height[right])
            {
                left++;
                right++;
            }
            if(right >= height.length)
            {
                System.out.println("increasing array");
                return 0;
            }
        }

        int l = height.length - 2;
        int r = height.length - 1;

        // Checks if array only decreases from right to left
        while(height[right] <= height[left])
        {
            if(height[r] <= height[l])
            {
                l--;
                r--;
                if(l <= r)
                {
                    newRight = l;
                    System.out.println("newRight: " + newRight + " value: " + height[newRight]);
                }
                if(l < 0)
                {
                    System.out.println("decreasing array");
                    return 0;
                }
                if(newLeft == newRight)
                {
                    System.out.println("found middle of array");
                    return 0;
                }
            }
        }

        /** To-Do: Add water **/

        left = newLeft;
        right = newRight;

        System.out.println("left: " + left + " value: " + height[left]);
        System.out.println("right: " + right + " value " + height[right]);
//        while (left <= right)
//        {
//            while (height[right] < height[left])
//            {
//                result += height[left] - height[right];
//                System.out.println(result);
//                right++;
//            }
//            if (height[right] >= height[left])
//            {
//                System.out.println(left + ", " + right);
//                left = right;
//                System.out.println("left equals right");
//                right++;
//            }
//        }

        System.out.println("finished method");
        return result;
    }
}
