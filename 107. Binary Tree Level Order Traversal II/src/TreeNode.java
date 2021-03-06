public class TreeNode
{
    // Declares value and tree node left and right.
    int value;
    TreeNode left;
    TreeNode right;

    // Accepts value for tree node.
    TreeNode(int value)
    {
        this.value = value;
    }

    // Getters and setters.
    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public TreeNode getLeft()
    {
        return left;
    }

    public void setLeft(TreeNode left)
    {
        this.left = left;
    }

    public TreeNode getRight()
    {
        return right;
    }

    public void setRight(TreeNode right)
    {
        this.right = right;
    }
}