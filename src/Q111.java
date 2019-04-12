import supportingFiles.TreeNode;

public class Q111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.min(minDepth(root.left,1),minDepth(root.right,1));
    }
    public int minDepth(TreeNode root, int depth){
        depth++;
        if (root == null) {
            return depth;
        }
        return Math.min(minDepth(root.left,++depth),minDepth(root.right,++depth));
    }
}
