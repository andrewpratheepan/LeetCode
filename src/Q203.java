import supportingFiles.ListNode;

public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        while (head.val==val && head !=null){
            head = head.next;
            if (head == null) return head;
        }
        ListNode temp = head;
        while (head!=null){
            if (head.next == null) break;
            if (head.next.val==val){
                head.next= head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return temp;
    }
}
