import supportingFiles.ListNode;

import java.util.*;

public class Q20 {
    public boolean isValid(String s) {
        if (s.length()==0 || s == null){
            return true;
        }
        Map map = new HashMap<String,String>();
        map.put("[","]");
        map.put("{","}");
        map.put("(",")");
        List list = new ArrayList();
        list.add("[");
        list.add("{");
        list.add("(");
        Stack stack = new Stack<String>();
        StringBuffer buffer = new StringBuffer(s);
        for (int i = 0; i< s.length(); i++){
            if (list.indexOf(buffer.substring(i,i+1)) != -1){
                stack.push(buffer.substring(i,i+1));
            }
            else if (!stack.isEmpty()){

            }
        }
        return false;
    }

}
