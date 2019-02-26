// Matthew Clark
// LeetCode 83. Remove Duplicates from Sorted List (Easy)
// Runtime 66.02%

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
    }
}

public class Solution
{
    ListNode head;
    public static void main(String[] args)
    {
        Solution list = new Solution();
        int[] sortedList = { 10, 20, 20, 30, 30, 40};
        ListNode head = new ListNode(sortedList[0]);

        for(int i = 1; i < sortedList.length; i++)
        {
            list.push(head, sortedList[i]);
        }

        ListNode n = list.deleteDuplicates(head);
        System.out.println("Removed Duplicate List : ");
        list.display(n);
    }

    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode delDupTemp = head;
        while(delDupTemp.next != null)
        {
            if(delDupTemp.val == delDupTemp.next.val)
            {
                delDupTemp.next = delDupTemp.next.next;
            }
            else{
                delDupTemp = delDupTemp.next;
            }
        }
        return head;
    }

    public void push(ListNode head, int n)
    {
        ListNode tempPush = head;
        while(tempPush.next != null)
        {
            tempPush = tempPush.next;
        }
        tempPush.next = new ListNode(n);
    }

    public void display(ListNode head)
    {
        ListNode tempDisplay = head;
        while(tempDisplay != null)
        {
            System.out.println(tempDisplay.val);
            tempDisplay = tempDisplay.next;
        }
    }
}