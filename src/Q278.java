public class Q278 {
    public int firstBadVersion(int n) {
        int higher = n;
        int lower = 0;
        int temp = 0;
        while (lower<higher){
            temp = lower + (higher - lower)/2;
            if (isBadVersion(temp)){
                higher = temp;
            }
            else{
                lower = temp + 1;
            }
        }
        return lower;
    }

    private boolean isBadVersion(int version){
        return true;
    }
}
