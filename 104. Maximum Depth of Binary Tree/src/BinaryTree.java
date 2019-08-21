public class BinaryTree
{
    TreeNode root;

    public int maxDepth(TreeNode root)
    {
        int maxDepth = 0;
        if(root == null)
        {
            return maxDepth;
        }
        return checkDepth(root, maxDepth);
    }

    public int checkDepth(TreeNode root, int maxDepth)
    {
        if(root == null)
        {
            return maxDepth;
        }
        maxDepth++;
        return Math.max(checkDepth(root.left, maxDepth), (checkDepth(root.right, maxDepth)));
    }
}
