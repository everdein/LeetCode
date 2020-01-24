// Matthew Clark
// LeetCode 42. Trapping Rain Water (Hard)
// Runtime

// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it is able to trap after raining.

public class TrappingWater
{
    public static void main(String[] args)
    {
        // Test Cases
        int[] mountain = {0, 1, 0, 5, 1, 6, 3, 4, 2, 1, 2, 1}; // 5 wrong
        //                0  1  2  3  4  5  6  7  8  9  10 11
//        int[] height = {0, 1, 0, 2, 1, 4, 2, 1, 0}; // 2
//        int[] increasing = {0, 1, 2, 3, 4}; // 0
//        int[] decreasing = {4, 3, 2, 1, 0}; // 0
//        int[] trap = {0, 1, 2, 3, 1, 1, 3, 2, 1, 0}; // 4
//        int[] ugh = {5, 4, 1, 2}; // 1
//        int[] check = {9,8,2,6}; // 4
        System.out.println("Result: " + trap(mountain));
//        System.out.println("Result: " + trap(height));
//        System.out.println("Result: " + trap(increasing));
//        System.out.println("Result: " + trap(decreasing));
//        System.out.println("Result: " + trap(trap));
//        System.out.println("Result: " + trap(ugh));
//        System.out.println("Result: " + trap(check));
    }
    public static int trap(int[] height)
    {
        // Return 0 if array is empty.
        if(height.length < 3){ return 0; }
        // Set pointers.
        int l = 0;
        int r = 1;
        int trueLeft = 0;
        int trueRight = height.length - 1;
        // Moves pointer from left to right seeking the first drop off.
        while(height[l] <= height[r])
        {
            if(r >= l)
            {
                trueLeft = r;
            }
            if(height[l] <= height[r])
            {
                l++;
                r++;
            }
            // Return 0 for increasing array.
            if(r >= height.length)
            {
                return 0;
            }
        }
        // Moves pointer from right to left seeking the first drop off.
        // Update pointers.
        l = height.length - 2;
        r = height.length - 1;
        while(height[r] <= height[l])
        {
            if(height[r] <= height[l])
            {
                l--;
                r--;
                if(l <= r)
                {
                    trueRight = r;
                }
                // Return 0 for decreasing array.
                if(l < 0)
                {
                    return 0;
                }
                // Return 0 for peak array.
                if(trueLeft == trueRight)
                {
                    return 0;
                }
            }
        }
        // Update pointers.
        l = trueLeft + 1;
        r = trueLeft + 2;
        // Scan from left to right searching for a height that is the same or greater than trueLeft[height].
        int result = 0;
        while(trueLeft != trueRight)
        {
            // int[] mountain = {0, 1, 0, 5, 1, 6, 3, 4, 2, 1, 2, 1}; // 5 wrong
            //                   0  1  2  3  4  5  6  7  8  9  10 11

            int maxHeight = 0;
            int maxHeightLocation = 0;
            while(height[trueLeft] >= height[maxHeight] && r != trueRight)
            {
                if(maxHeight < height[r])
                {
                    maxHeight = height[r];
                    maxHeightLocation = r;
                }
                System.out.println(r);
                r++;
            }
            while(l != r)
            {
                if(height[trueLeft] >= height[r])
                {
                    l++;
                    result += height[r] - height[l];
                    System.out.println(result + " += " + height[trueLeft] + " - " + height[l]);
                }
                else
                {
                    result += height[trueLeft] - height[l];
                    System.out.println("else: " + result + " += " + height[r] + " - " + height[l]);
                    l++;
                }
            }
            trueLeft = r;
            // All pointers trueLeft, trueRight, l, and r should end in the same place.
            // When trueLeft equals trueRight all indices of the array have been evaluated.
            if(trueLeft == trueRight)
            {
                System.out.println("TL: " + trueLeft + " TR: " + trueRight + " L: " + l + " R: " + r);
                System.out.println("maxHeight: " + maxHeight + " location: " + maxHeightLocation);
                break;
            }
            // Reset pointers.
            l = trueLeft + 1;
            r = trueLeft + 2;
        }
        return result;
    }
}
