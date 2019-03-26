import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q35 {
    public int searchInsert(int[] nums, int target) {
        ArrayList arr = new ArrayList();
        for (int i = 0; i<nums.length; i++){
            arr.add(nums[i]);
        }
        if (arr.indexOf(target) == -1){
            arr.add(target);
            Collections.sort(arr);
        }
        return arr.indexOf(target);
    }
}
