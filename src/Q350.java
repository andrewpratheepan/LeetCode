import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    nums1[i] = Integer.MAX_VALUE;
                }
            }
        }

        int[] returnArray = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            returnArray[i] = list.get(i);
        }

        return returnArray;
    }
}
