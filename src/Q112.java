public class Q112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return dfs(root, sum - 0);
    }

    private boolean dfs(TreeNode root, int sum) {
        int delta = sum - root.val;
        if (root.left == null && root.right == null) {
            return delta == 0;
        }

        if (root.left != null && root.right != null) {
            return dfs(root.left, sum - root.val) || dfs(root.right, sum-root.val);
        } else if (root.left != null) {
            return dfs(root.left, sum - root.val);
        } else {
            return dfs(root.right, sum-root.val);
        }

    }
}
