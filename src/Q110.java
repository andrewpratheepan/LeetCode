import supportingFiles.TreeNode;

public class Q110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getHeight(root.left)-getHeight(root.right))>=2){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);

    }
    public int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
