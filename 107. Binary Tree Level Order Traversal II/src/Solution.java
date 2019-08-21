
class Solution
{
    // Main.
    public static void main(String[] args)
    {
        // Hello world!
        System.out.println("Hello world!");

        // Creates tree.
        BinaryTree tree = new BinaryTree();

        // Adds nodes to tree.
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);


    }
}