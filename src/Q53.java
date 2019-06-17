import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int len;
        if((len = nums.length) == 0) return 0;
        int maxSum = nums[0], prevSum = nums[0];
        for(int i = 1; i < len; i++) {
            prevSum = Math.max(prevSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, prevSum);
        }
        return maxSum;
    }
    static String findNumber(List<Integer> arr, int k) {
        for (int temp:arr){
            if (k == temp){
                return "YES";
            }
        }
        return "NO";

    }
}
