import supportingFiles.TreeNode;

public class Q235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int valP = p.val;
        int valQ = q.val;

        while (root!=null){
            int valRoot = root.val;
            if (valP > valRoot && valQ > valRoot){
                root = root.right;
            }
            else if (valP < valRoot && valQ < valRoot){
                root = root.left;
            }
            else {
                return root;
            }
        }
        return null;
    }
}
