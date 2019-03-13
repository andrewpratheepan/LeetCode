import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1L = nums1.length, nums2L= nums2.length;
        int[] nums3 = (int[]) Array.newInstance(nums1.getClass().getComponentType(), nums1L + nums2L);
        System.arraycopy(nums1, 0, nums3, 0, nums1L);
        System.arraycopy(nums2, 0, nums3, nums1L, nums2L);
        Arrays.sort(nums3);
        int nums3L = nums3.length-1;
        if (nums3.length%2 == 0){
            return (nums3[nums3L/2]+nums3[nums3L/2+1])/2.0;
        }
        else{
            return nums3[nums3L/2];
        }
    }
}
