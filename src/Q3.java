import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set unique = new HashSet();//since it is a set, used as a unique value check
        int temp = 0, lowerBound = 0, upperBound = 0;
        while (lowerBound < length && upperBound < length){
            if (unique.contains(s.charAt(upperBound))){
                unique.remove(s.charAt(lowerBound));
                lowerBound++;
            } // moves lowerBound up to check for new String
            else{
                unique.add(s.charAt(upperBound));//add to unique check
                upperBound++;//expands upperBound range
                temp = (temp > (upperBound-lowerBound)) ? temp:(upperBound-lowerBound);
            }
        }
        return temp;
    }

}
