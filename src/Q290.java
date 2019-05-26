import java.util.HashMap;
import java.util.Map;

public class Q290 {
    public boolean wordPattern(String pattern, String str) {
        String[] valArray = str.split(" ");
        Map map = new HashMap<Character,String>();
        char temp;
        String tempStr;
        if (valArray.length != pattern.length()){
            return false;
        }
        for (int i = 0; i<pattern.length();i++){
            temp = pattern.charAt(i);
            tempStr = valArray[i];
            if (!map.containsKey(temp)){
                if (map.containsValue(tempStr)){
                    return false;
                }
                map.put(temp,tempStr);
            }
            else if (!map.get(temp).equals(tempStr)){
                return false;
            }
        }
        return true;
    }
}
