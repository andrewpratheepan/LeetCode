public class Q400 {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        long num = 0;
        long end = 0;
        long len = 1;
        long div = 9;
        while (true) {
            long newDigits = (len * div) + num;
            if (newDigits >= n) {
                break;
            }
            end = (end * 10) + 9;
            num = newDigits;
            div *= 10;
            len++;
        }
        long diff = n - num;
        long modLeft = diff % len;
        end += diff / len;
        if (modLeft == 0) {
            return (int) (end % 10);
        }
        end++;
        for (int i = 0; i < len - modLeft; i++) {
            end /= 10;
        }
        return (int) (end % 10);
    }
}
