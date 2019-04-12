import supportingFiles.ListNode;
import supportingFiles.TreeNode;

public class TesterClass {
    public static void main(String args[]){
        Q111 test = new Q111();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(test.minDepth(root));
    }
}
