import java.util.*;

public class Q414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> q = new LinkedList();
        Map map = new HashMap();
        for (int n:nums){
            if (!map.containsKey(n)) q.add(n);
            map.put(n,n);
        }
        if (q.size()>=3){
            return q.get(q.size()-3);
        }
        return q.get(q.size()-1);
    }
}
