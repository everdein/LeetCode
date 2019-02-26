// Matthew Clark
// LeetCode 21. Merge Two Sorted Lists (Easy)
// Runtime 71.67%

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
        int[] l1 = { 10, 30, 50, 70};
        ListNode head1 = new ListNode(l1[0]);
        for(int i = 1; i < l1.length; i++)
        {
            list.push(head1, l1[i]);
            System.out.println("First List : ");
            list.display(head1);
        }
        int[] l2 = {20, 40, 60, 80};
        ListNode head2 = new ListNode(l2[0]);
        for(int count = 1; count < l2.length; count++)
        {
            list.push(head2, l2[count]);
        }
        System.out.println("Second List : ");
        list.display(head2);
        
        ListNode n = list.mergeTwoLists(head1, head2);
        System.out.println("Merged List : ");
        list.display(n);
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode head;
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        }
        else if(l1.val < l2.val)
        {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        else
        {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    public void push(ListNode head, int n)
    {
        while(head.next != null)
        {
            head = head.next;
        }
        head.next = new ListNode(n);
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