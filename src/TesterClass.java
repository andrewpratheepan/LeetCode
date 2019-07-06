import supportingFiles.ListNode;
import supportingFiles.TreeNode;

import java.util.List;

public class TesterClass {
    public static void main(String args[]){
    Q599 test = new Q599();
    String[] o = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
    String[] i = new String[]{"KFC","Shogun","Burger King"};

    System.out.print(test.findRestaurant(i,o));

    }
}
