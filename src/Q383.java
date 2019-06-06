import java.util.HashMap;
import java.util.Map;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] temp = new char[256];
        for (int i = 0; i < magazine.length(); i++) {
            temp[magazine.charAt(i)]+=magazine.charAt(i);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (temp[ransomNote.charAt(i)]==0){
                return false;
            }
            temp[ransomNote.charAt(i)]-= ransomNote.charAt(i);
        }
        return true;
        /*
        Map<Character,Integer> map = new HashMap();
        char temp;
        for (int i = 0; i<magazine.length(); i++){
            temp = magazine.charAt(i);
            map.put(temp, map.get(temp) == null ? 1:map.get(temp)+1);
        }
        for (int i = 0; i<ransomNote.length();i++){
            temp = ransomNote.charAt(i);
            if (map.get(temp) == null || map.get(temp)==0){
                return false;
            }
            else {
                map.put(temp,map.get(temp)-1);
            }
        }
        return true;*/
    }
}
