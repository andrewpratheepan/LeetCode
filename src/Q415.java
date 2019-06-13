import java.util.HashMap;
import java.util.Map;

public class Q415 {
    public String addStrings(String num1, String num2) {
        StringBuilder build = new StringBuilder();
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int sum = 0;
        boolean carry = false;
        while (n1 >= 0 || n2 >= 0){
            if (n1>=0){
                sum+= num1.charAt(n1)-'0';
                n1--;
            }
            if (n2>=0){
                sum+= num2.charAt(n2)-'0';
                n2--;
            }
            build.append(sum%10);
            sum = (sum>9) ? 1:0;
        }
        if (sum == 1){
            build.append(1);
        }
        return build.reverse().toString();
    }
}
