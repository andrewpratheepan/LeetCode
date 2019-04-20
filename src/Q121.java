public class Q121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length==0) return 0;
        int max = 0;
        Integer temp = 0;
        for (int i = 0; i<prices.length;i++){
            for (int j = i+1; j<prices.length;j++){
                temp = new Integer(prices[j]-prices[i]);
                if (temp>max){
                    max = temp;
                }
            }
        }
        return max;
    }
}
