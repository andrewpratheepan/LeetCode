import supportingFiles.ListNode;

public class Q206 {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
