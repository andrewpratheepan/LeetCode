import supportingFiles.ListNode;
import supportingFiles.TreeNode;

public class TesterClass {
    public static void main(String args[]){
        Q104 test = new Q104();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(test.maxDepth(root));
    }
}
