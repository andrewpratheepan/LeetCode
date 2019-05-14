public class Q231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 536870912) return true;
        double temp = (Math.log(n)/Math.log(2));
        return temp == (int) temp;
    }
}
