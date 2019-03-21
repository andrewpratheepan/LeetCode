import supportingFiles.ListNode;

public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        if (l1.val < l2.val){
            temp.val = l1.val;
            temp.next = new ListNode(l2.val);
        }
        else{
            temp.val = l2.val;
            temp.next = new ListNode(l1.val);
        }

        while (l1.next != null && l2.next != null){

        }
        return null;
    }

}
