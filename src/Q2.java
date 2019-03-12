import supportingFiles.ListNode;

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver=0;
        int val1,val2,sum;
        ListNode returnNode = new ListNode(0);
        ListNode k1 = l1, k2 = l2, cr = returnNode;
        while (k1 != null || k2 != null){
            if (k1 == null){
                val1=0;
            }
            else{
                val1=k1.val;
            }
            if (k2 == null){
                val2=0;
            }
            else{
                val2=k2.val;
            }
            sum = val1+val2+carryOver;
            carryOver /= 10;
            cr.next = new ListNode(sum%10);
            cr =cr.next;
            if (k1 != null) {k1 = k1.next;}
            if (k2 != null) {k2 = k2.next;}
        }
        if (carryOver>0){returnNode.next = new ListNode(carryOver);}
        return returnNode.next;
    }
}
