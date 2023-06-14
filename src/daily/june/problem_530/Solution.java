package daily.june.problem_530;

class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    int min = 100001;
    int val = -1;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }

    public void dfs(TreeNode node) {

        if (node.left != null) {
            dfs(node.left);
        }

        if (val >= 0) {
            min = Math.min(min, node.val - val);
        }

        val = node.val;
        if (node.right != null) {
            dfs(node.right);
        }
    }
}
