import java.util.HashMap;

public class Q594 {
    public int findLHS(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int numsArraySize = 0;
        for (int num: nums) {
            if (map.get(num) == null){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }
        }
        for (int key: map.keySet()) {
            if (map.containsKey(key + 1))
                numsArraySize = Math.max(numsArraySize, map.get(key) + map.get(key + 1));
        }
        return numsArraySize;
    }
}
