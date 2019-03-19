public class Q20 {
    public boolean isValid(String s) {
        if (s.length()==0 || s == null){
            return true;
        }
        char temp = s.charAt(0);
        int len = s.length();
        boolean check = false;
        for (int i = 1; i<len; i++){
            if (temp == '(' && s.charAt(i) == ')'){
                check = true;
                return true && isValid(s.substring(1,i)+s.substring(i,len));
            }
        }
        return check;
    }
}
