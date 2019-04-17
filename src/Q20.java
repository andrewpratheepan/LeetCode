import supportingFiles.ListNode;

import java.util.*;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        if(s.length()==1) return false;
        if(s=="") return true;

        for(int i=0;i<s.length();i++){
            char at = s.charAt(i);
            if(at=='('||at=='['||at=='{'){
                check.push(at);
                continue;
            }
            if(!check.isEmpty()){
                char m = check.pop();
                if(!(m=='('&&at==')'||m=='['&&at==']'||m=='{'&&at=='}'))
                    return false;
            }
            else{
                if(at==')'||at==']'||at=='}')
                    return false;
            }
        }
        return check.isEmpty();
    }

}
