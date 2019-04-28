public class Q168 {
    public String convertToTitle(int n) {
        StringBuffer buffer = new StringBuffer();
        char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' , 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int temp = 0;
        n--;
        while (n>=0){
            temp = n%26;
            n=n/26;
            buffer.append(alpha[temp]);
            if (n == 0) break;
            n--;
        }
        return buffer.reverse().toString();
    }
}
