import java.util.HashMap;
import java.util.Map;

public class Q268 {
    public int missingNumber(int[] nums) {
        Map keys = new HashMap<>();
        for (int num:nums){
            keys.put(num,num);
        }
        for (int i = 0; i<=nums.length;i++){
            if (!keys.containsKey(i)) return i;
        }
        return 0;
    }
}
