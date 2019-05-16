import supportingFiles.ListNode;

import java.util.Stack;

public class Q234 {
    public boolean isPalindrome(ListNode head) {
        ListNode hold = head;
        Stack<Integer> check = new Stack<>();
        while (head != null){
            check.push(head.val);
            head = head.next;
        }
        while (hold != null){
            if (hold.val != check.pop()){
                return false;
            }
            hold = hold.next;
        }
        return true;
    }
}
