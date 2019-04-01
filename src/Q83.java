import supportingFiles.ListNode;

public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode returnNode = head;
        while (head != null && head.next != null){
            if (head.val == head.next.val){
               head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return returnNode;
    }
}
