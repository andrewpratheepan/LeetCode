import supportingFiles.TreeNode;

public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }
}
