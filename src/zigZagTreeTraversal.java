// Java implementation of a O(n) time method for
// Zigzag order traversal
import java.util.*;
public class zigZagTreeTraversal
{
    // Class containing left and
    // right child of current
    // node and key value
    static class Node {

        public int data;
        public Node left, right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    // A utility function to create a new node
    static Node newNode(int data)
    {
        Node node = new Node(data);
        return node;
    }

    // Function to print the zigzag traversal
    static Vector<Integer> zigZagTraversal(Node root)
    {
        Deque<Node> q = new LinkedList<Node>();
        Vector<Integer> v = new Vector<Integer>();
        q.add(root);
        v.add(root.data);
        Node temp;

        // set initial level as 1, because root is
        // already been taken care of.
        int l = 1;

        while (q.size() > 0) {
            int n = q.size();

            for (int i = 0; i < n; i++) {

                // popping mechanism
                if (l % 2 == 0) {
                    temp = q.peekLast();
                    q.pollLast();
                }
                else {
                    temp = q.peekFirst();
                    q.pollFirst();
                }

                // pushing mechanism
                if (l % 2 != 0) {

                    if (temp.right != null) {
                        q.add(temp.right);
                        v.add(temp.right.data);
                    }
                    if (temp.left != null) {
                        q.add(temp.left);
                        v.add(temp.left.data);
                    }
                }
                else if (l % 2 == 0) {

                    if (temp.left != null) {
                        q.offerFirst(temp.left);
                        v.add(temp.left.data);
                    }
                    if (temp.right != null) {
                        q.offerFirst(temp.right);
                        v.add(temp.right.data);
                    }
                }
            }
            l++; // level plus one
        }
        return v;
    }

    public static void main(String[] args)
    {

        // vector to store the traversal order.
        Vector<Integer> v;

        // create tree
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(7);
        root.left.right = newNode(6);
        root.right.left = newNode(5);
        root.right.right = newNode(4);
        System.out.println("ZigZag Order traversal of binary tree is");

        v = zigZagTraversal(root);

        for (int i = 0; i < v.size();
             i++) { // to print the order
            System.out.print(v.get(i) + " ");
        }
    }
}

