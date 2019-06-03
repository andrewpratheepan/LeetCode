public class Q367 {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i<Math.sqrt(Integer.MAX_VALUE);i++){
            if (i*i == num){
                return true;
            }
            if (i*i>num){
                break;
            }
        }
        return false;
    }
}
