import java.util.*;

public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map map = new HashMap();
        List<Integer> list = new ArrayList();
        for (int i = 0; i<nums1.length;i++){
            map.put(nums1[i],nums1[i]);
        }
        for (int i = 0; i<nums2.length; i++){
            if (map.containsKey(nums2[i])) {
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i<list.size();i++)
            array[i] = list.get(i);
        return array;
    }
}
