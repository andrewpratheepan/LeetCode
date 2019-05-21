public class Q258 {
    public int addDigits(int num) {
        int sum = 0;
        while (true){
            sum += num%10;
            num /= 10;
            if (num==0){
                if (sum<10){
                    return sum;
                }
                num = sum;
                sum = 0;
            }
        }
    }
}
