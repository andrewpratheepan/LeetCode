public class Q633 {
    public boolean judgeSquareSum(int c) {
        for (double i = 0; i*i < c; i++) {
            double j = c-i*i;
            if (Math.sqrt(j)%1 == 0){
                return true;
            }
        }
        if (c==0){
            return true;
        }
        return false;
    }
}
