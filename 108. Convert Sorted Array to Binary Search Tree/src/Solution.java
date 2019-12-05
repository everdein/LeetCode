import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

//        tree.root = new TreeNode(0);
//        tree.root.left = new TreeNode(-3);
//        tree.root.right = new TreeNode(9);
//        tree.root.left.left = new TreeNode(-10);
//        tree.root.right.left = new TreeNode(5);

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode result = tree.sortedArrayToBST(nums);

        System.out.println(result);
    }
}
