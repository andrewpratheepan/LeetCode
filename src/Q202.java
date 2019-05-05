import java.util.ArrayList;

public class Q202 {
    public boolean isHappy(int n) {
        double sum;
        ArrayList contains = new ArrayList();
        while (n!=1 && !contains.contains(n)){
            contains.add(n);
            sum = 0;
            while (n>0){
                sum += Math.pow((n%10),2);
                n/=10;
            }
            n = (int) sum;
        }
        return n==1;
    }
}
