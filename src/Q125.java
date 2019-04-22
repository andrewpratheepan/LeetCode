public class Q125 {
    public boolean isPalindrome(String s) {
        if (s == null || s=="") return true;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            if (Character.isLetter(temp) || Character.isDigit(temp)){
                buffer.append(temp);
            }
        }
        String normal = buffer.toString().toLowerCase();
        String reverse = buffer.reverse().toString().toLowerCase();
        return normal.equals(reverse);
    }
}
