package org.example.Trees;


import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        helper(root, targetSum, path, result);
        return result;
    }

    private void helper(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        if (node.left == null && node.right == null && node.val == targetSum) {
            result.add(new ArrayList<>(path));
        } else {
            helper(node.left, targetSum - node.val, path, result);
            helper(node.right, targetSum - node.val, path, result);
        }
        path.remove(path.size() - 1);
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
