import java.util.ArrayList;
import java.util.Arrays;

public class Q581 {
    public int findUnsortedSubarray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] placeHolder = nums.clone();

        Arrays.sort(placeHolder);
        for(int i=0;i<nums.length;i++){
            if(placeHolder[i] != nums[i]){
                list.add(i);
            }
        }

        if(list.size() > 1){
            return list.get((list.size()-1)) - list.get(0) + 1;
        }
        else return 0;
    }
}
