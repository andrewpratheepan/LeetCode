public class Q441 {
    //level((level+1)/2) <= n
    //level^2 < level^2 + level <= 2n
    public int arrangeCoins(int n) {
        int i = 0;
        while(n>=0){
            i++;
            n-=i;
        }
        return i-1;
    }
}
