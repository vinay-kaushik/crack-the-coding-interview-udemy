
class Node2
{
    int key;
    Node2 left = null, right = null;

    Node2(int key) {
        this.key = key;
    }
}

class Main
{
    // Function to print all Node2s of a given level from left to right
    public static boolean printLevel(Node2 root, int level)
    {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1)
        {
            System.out.print(root.key + " ");

            // return true if at least one Node2 is present at a given level
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    // Function to print level order traversal of a given binary tree
    public static void levelOrderTraversal(Node2 root)
    {
        // start from level 1 — till the height of the tree
        int level = 1;

        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
    }

    public static void main(String[] args)
    {
        Node2 root = new Node2(15);
        root.left = new Node2(10);
        root.right = new Node2(20);
        root.left.left = new Node2(8);
        root.left.right = new Node2(12);
        root.right.left = new Node2(16);
        root.right.right = new Node2(25);

        levelOrderTraversal(root);
    }
}