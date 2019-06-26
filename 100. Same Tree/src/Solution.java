class Solution
{
    public static void main(String[] args)
    {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.right = new TreeNode(3);

        System.out.println("Tree 1:");
        System.out.println("Post Order:");
        tree1.printPostOrder(tree1.root);

        System.out.println("In Order:");
        tree1.printInOrder(tree1.root);

        System.out.println("Pre Order:");
        tree1.printPreOrder(tree1.root);

        System.out.println("\nTree 2:");
        System.out.println("Post Order:");
        tree2.printPostOrder(tree2.root);

        System.out.println("In Order:");
        tree2.printInOrder(tree2.root);

        System.out.println("Pre Order:");
        tree2.printPreOrder(tree2.root);

        BinaryTree check = new BinaryTree();
        boolean same = check.isSameTree(tree1.root, tree2.root);
        System.out.println("\nTrue or False: \nAre the trees the same?");
        System.out.println(same);
    }
}