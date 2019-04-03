import java.math.BigInteger;

public class Q8 {
    public int myAtoi(String str) {

        str = str.trim();
        if (str.equals("")){
            return 0;
        }
        StringBuffer buffer = new StringBuffer();
        char ch = str.charAt(0);
        int start = 0;
        if (ch == '-' && str.length()>1){
            buffer.append(ch);
            start = 1;
        }
        if (ch == '+' && str.length()>1){
            start = 1;
        }
        for (int i = start; i<str.length();i++){
            ch = str.charAt(i);
            if (Character.isDigit(ch)){
                buffer.append(ch);
            }
            else{
                break;
            }
        }

        if (buffer.toString().equals("")){
            return 0;
        }
        BigInteger returnInt = new BigInteger("0");
        try {
            returnInt = new BigInteger(buffer.toString());
        }
        catch (Exception e){
            return 0;
        }
        if (returnInt.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))>=0){
            return Integer.MAX_VALUE;
        }
        if (returnInt.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))<=0){
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(returnInt.toString());
    }

}