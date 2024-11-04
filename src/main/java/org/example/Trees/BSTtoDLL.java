package org.example.Trees;

public class BSTtoDLL {
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        Node left = treeToDoublyList(root.left);
        Node right = treeToDoublyList(root.right);

        root.left= left;
        if (left != null) {
            left.right = root;
        }

        root.right = right;
        if (right != null) {
            right.left = root;
        }

        return left != null ? left : root;
    }

    public class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
}
