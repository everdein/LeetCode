import java.util.*;

public class BinaryTree
{
    // Declares tree node root.
    TreeNode root;

    // Declares root as null.
    BinaryTree()
    {
        root = null;
    }

    // Stores binary tree rows from the bottom up into a list of list integers.
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        // Declares list.
        List<List<Integer>> result = new ArrayList<>();

        // Checks if root is null.
        if(root==null) { return result; }

        // Declares stack.
        Stack<List<Integer>> stack = new Stack<>();

        // Declares queue of linked lists.
        Queue<TreeNode> queue = new LinkedList<>();

        // Adds root to queue.
        queue.add(root);

        // While queue is not empty.
        while(!queue.isEmpty())
        {
            // Declares list.
            List<Integer> list = new ArrayList<>();

            // Declares size as queue size.
            int size = queue.size();

            // While size is greater than 0.
            while(size-- > 0)
            {
                // Declares temp to remove value from queue.
                TreeNode temp = queue.remove();

                // Adds removed value from queue to list.
                list.add(temp.value);

                // If left node does not equal null.
                if(temp.left != null) { queue.add(temp.left); }

                // Removes right node from queue when not null.
                if(temp.right != null) { queue.add(temp.right); }
            }
            // Pushes list to stack.
            stack.push(list);
        }

        // While stack is not empty.
        while(!stack.isEmpty())
        {
            // Remove from stack and add to result list.
            result.add(stack.pop());
        }

        // Return result.
        return result;
    }
}