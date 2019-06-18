import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i<nums.length; i++){
            temp = Math.abs(nums[i])-1;
            if (nums[temp]>0){
                nums[temp] = -nums[temp];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
