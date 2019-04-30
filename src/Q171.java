import java.util.Arrays;

public class Q171 {
    public int titleToNumber(String s) {
        char [] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' , 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (s == null || s.equals("")) return 0;
        int sum = 0;
        int multiplier = 1;
        int temp = 0;
        for (int i = s.length()-1; i>=0;i--){
            for (int j = 0; j<alpha.length;j++){
                if (alpha[j] == s.charAt(i)){
                    temp = j+1;
                }
            }
            sum += multiplier*temp;
            multiplier*=26;
        }
        return sum;
    }
}
