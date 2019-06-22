import java.util.HashMap;
import java.util.Map;

public class Q496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            temp = map.get(nums1[i]);
            for (int j = temp; j<nums2.length;j++){
                if (nums2[j]>nums1[i]){
                    output[i] = nums2[j];
                    break;
                }
                output[i] = -1;
            }
        }
        return output;
    }
}
