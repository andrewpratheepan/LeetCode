import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int val = Integer.MAX_VALUE;
        List<String> name = new ArrayList<>();
        int temp = 0;
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])){
                temp = map.get(list2[i]) + i;
                if (temp == val){
                    name.add(list2[i]);
                }
                else if (temp<val){
                    name.clear();
                    val = temp;
                    name.add(list2[i]);
                }
            }
        }
        String[] list = new String[name.size()];
        for (int i = 0; i < list.length; i++) {
            list[i] = name.get(i);
        }
        return list;
    }
}
