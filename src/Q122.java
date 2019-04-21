public class Q122 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length==0) return 0;
        int sum = 0;
        Integer temp = 0;
        for (int i = 0; i<prices.length-1;i++){
            temp = new Integer(prices[i+1]-prices[i]);
            if (temp>0) {
                sum += temp;
            }
        }
        return sum;
    }
}
