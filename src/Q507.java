public class Q507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1 || num == 0) return false;
        int temp = 0;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num%i==0){
                temp = num/i;
                if (temp == i || i == 1){
                    sum+=i;
                }
                else{
                    sum += i + temp;
                }
            }
        }
        return sum == num;
    }
}
