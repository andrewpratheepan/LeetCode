import supportingFiles.ListNode;
import supportingFiles.TreeNode;

import java.util.List;

public class TesterClass {
    public static void main(String args[]){
        Q237 test = new Q237();
        ListNode q = new ListNode(0);
        q.next = new ListNode(1);
        q.next.next = new ListNode(2);
        test.deleteNode(q);


    }
}
