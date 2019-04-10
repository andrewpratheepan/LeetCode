import supportingFiles.TreeNode;

import java.util.ArrayList;

public class Q112 {
    ArrayList listSums = new ArrayList();
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left!=null) itt(root.left,root.val);
        if (root.right!=null) itt(root.right,root.val);
        if (listSums.indexOf(new Integer(sum))!=-1){
            return true;
        }
        return false;
    }
    public void itt(TreeNode node, int sum){
        if (node == null){
            listSums.add(sum);
            return;
        }
        sum += node.val;
        itt(node.right,sum);
        itt(node.left,sum);
    }
}
