public class Solution
{
    public static void main(String[] args)
    {
        // Creates tree.
        BinaryTree tree = new BinaryTree();

        // Adds nodes to tree.
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        // Passes tree root and returns max depth of tree.
        int depth = tree.maxDepth(tree.root);

        // Prints depth of tree.
        System.out.println("The max depth of the tree is " + depth + ".");
    }
}
