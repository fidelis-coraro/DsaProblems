package org.example.Trees;

public class SumOfNodes {
    public int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
