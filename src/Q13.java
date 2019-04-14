import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public int romanToInt(String s) {
        Map map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int len = s.length();
        int sum = 0;

        for (int i = 0; i<len; i++){
            String temp = String.valueOf(s.charAt(i));
            if (i != len-1){
                if ((int) map.get(temp) < (int) map.get(String.valueOf(s.charAt(i + 1)))){
                    sum -= (int) map.get(temp);
                }
                else{
                    sum += (int) map.get(temp);
                }
            }
            else {
                sum += (int) map.get(temp);
            }
        }
        return sum;
    }
}
