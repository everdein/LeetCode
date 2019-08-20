public class Solution
{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);

        System.out.println("\nTrue or False: Are the trees the same?");
        boolean check = tree.isSymmetric(tree.root);
        System.out.println(check);
    }
}