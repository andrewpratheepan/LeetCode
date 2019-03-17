public class Q9 {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        StringBuffer buffer = new StringBuffer();
        for (int i = temp.length()-1; i>=0; i--){
            buffer.append(temp.charAt(i));
        }
        return temp.equals(buffer.toString());
    }
}
