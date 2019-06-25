import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] ranks = new String[nums.length];
        Map map = new HashMap();
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int itt = 1;
        for (int i = temp.length-1; i >= 0; i--) {
            map.put(temp[i],itt);
            itt++;
        }
        String tempString = "";
        for (int i = 0; i < nums.length; i++) {
            tempString = String.valueOf(map.get(nums[i]));
            if (Integer.valueOf(tempString)>3){
                ranks[i] = tempString;
            }
            else if (tempString.equals("1")){
                ranks[i] = "Gold Medal";
            }else if (tempString.equals("2")){
                ranks[i] = "Silver Medal";
            }
            else{
                ranks[i] = "Bronze Medal";
            }
        }
        return ranks;
    }
}
