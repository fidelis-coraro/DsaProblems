package org.example.Trees;

public class BinarySearchTree {
   // Insert Elements into a Binary Search Tree
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);

        }

        return root;

    }
    //Search for an Element in a Binary Search Tree
    public boolean search(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }
}

