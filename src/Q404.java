import supportingFiles.TreeNode;

public class Q404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left != null && root.left.right == null && root.left.left == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
    }
}
