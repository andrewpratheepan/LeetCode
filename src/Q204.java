public class Q204 {
    public int countPrimes(int n) {
        if (n<=1) return 0;
        int [] primeCheck = new int[n];//filled with 0s;
        primeCheck[0] = -1;
        primeCheck[1] = -1;

        for (int i = 2; i<Math.sqrt(n);i++){
            if (primeCheck[i] == 0){
                for (int j = i*i; j < n; j += i) {
                    primeCheck[j] = -1;
                }
            }
        }
        int temp = 0;
        for (int i = 0; i<primeCheck.length;i++){
            if (primeCheck[i]!=-1) temp++;
        }
        return temp;

    }
}
