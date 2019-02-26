// Matthew Clark
// LeetCode 88. Merge Sorted Array (Easy)
// Runtime 

class Solution
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
		int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n)
        {
            if (nums1[i] <= nums2[j])
            {
				temp[index++] = nums1[i++];
            }   
            else
            {
                temp[index++] = nums2[j++];
            }
		}
        while (i < m)
        {
			temp[index++] = nums1[i++];
		}
        while (j < n)
        {
			temp[index++] = nums2[j++];
		}
        for (int k = 0; k < index; k++)
        {
			nums1[k] = temp[k];
        }
        int arraySize = temp.length - 1;
        for(int k = 0; k <= arraySize; k++)
        {
            System.out.println(temp[k]);
        }
	}
}