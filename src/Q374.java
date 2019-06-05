public class Q374 {
    public int guessNumber(int n) {
        int lower = 1;
        int higher = n;
        int mid, guess;
        while (true){
            mid = lower + (higher-lower)/2;
            guess = guess(mid);
            if (guess==-1){
                higher = mid-1;
            }
            else if (guess == 1){
                lower = mid+1;
            }
            else {
                return mid;
            }
        }
    }

    private int guess(int i) {
        return 0;
    }

}
