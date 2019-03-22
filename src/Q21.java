import supportingFiles.ListNode;

public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(0);
        ListNode k1 = l1, k2 = l2, cr = returnNode;
        if (k1.val < k2.val){
            cr.next = new ListNode(l1.val);
            cr.next.next = new ListNode(l2.val);
        }
        else{
            cr.next = new ListNode(l2.val);
            cr.next.next = new ListNode(l1.val);
        }
        k1 = k1.next;
        k2 = k2.next;
        cr = cr.next.next;
        int val1,val2;

        while (k1 != null && k2 != null){
            val1 = k1.val;
            val2 = k2.val;
            if (val1 < val2){
                cr.next = new ListNode(val1);
            }
            if (val1 >= val2){
                cr.next = new ListNode(val2);
            }
            cr = cr.next;
            if (k1.next != null){
                k1 = k1.next;
            }
            if (k2.next != null){
                k2 = k2.next;
            }
        }
        ListNode temp = k1==null ? k2:k1;
        while (temp!= null){
            cr.next = new ListNode(temp.val);
            cr = cr.next;
            temp = temp.next;
        }
        return returnNode.next;
    }

}
