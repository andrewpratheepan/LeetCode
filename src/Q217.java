import java.util.HashMap;

public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap contains = new HashMap();
        if (nums == null || nums.length==0){
            return false;
        }
        for (int i = 0; i<nums.length;i++){
            if (contains.containsKey(nums[i])){
                return true;
            }
            contains.put(nums[i],-1);
        }
        return false;
    }
}
