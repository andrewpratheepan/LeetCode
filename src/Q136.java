import java.util.ArrayList;
import java.util.List;

public class Q136 {
    public int singleNumber(int[] nums) {
        List single = new ArrayList();
        for (int i = 0; i<nums.length; i++){
            if (single.contains(nums[i])){
                single.remove(single.indexOf(nums[i]));
            }
            else {
                single.add(nums[i]);
            }
        }
        return (int) single.get(0);
    }
}
