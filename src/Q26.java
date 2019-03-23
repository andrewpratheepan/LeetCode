import java.util.*;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        HashSet mySet = new HashSet();
        for (int i=0; i<nums.length;i++){
            mySet.add(nums[i]);
        }
        ArrayList list = new ArrayList();
        list.addAll(mySet);
        Collections.sort(list);
        for (int i = 0; i<list.size();i++){
            nums[i] = (int) list.get(i);
        }
        return mySet.size();
    }
}

