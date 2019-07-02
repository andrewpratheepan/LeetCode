import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q575 {
    public int distributeCandies(int[] candies) {
        Set set = new HashSet();
        for (int i:candies){
            set.add(i);
        }
        return set.size() > candies.length/2 ? candies.length/2:set.size();
    }
}
