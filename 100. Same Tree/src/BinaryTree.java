public class BinaryTree
{
    TreeNode root;

    BinaryTree()
    {
        root = null;
    }

    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p == null && q == null)
        {
            return true;
        }
        if(p == null || q == null)
        {
            return false;
        }
        if(p.getValue() != q.getValue())
        {
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public void printPostOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }
        printPostOrder(treeNode.left);
        printPostOrder(treeNode.right);
        System.out.println(treeNode.value + " ");
    }

    public void printInOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }
        printPostOrder(treeNode.left);
        System.out.println(treeNode.value + " ");
        printPostOrder(treeNode.right);
    }

    public void printPreOrder(TreeNode treeNode)
    {
        if(treeNode == null)
        {
            return;
        }
        System.out.println(treeNode.value + " ");
        printPostOrder(treeNode.left);
        printPostOrder(treeNode.right);
    }
}