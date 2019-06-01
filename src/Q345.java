import java.util.*;

public class Q345 {
    public String reverseVowels(String s) {
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        StringBuffer buffer = new StringBuffer(s);
        Map<Character,Character> vowels = new HashMap();
        for (char v:vowel){
            vowels.put(v,v);
        }
        int posEnd = s.length()-1;
        int posStart = 0;
        char start,end;
        while (posStart<posEnd){
            start = s.charAt(posStart);
            end = s.charAt(posEnd);
            if (vowels.containsKey(start) && vowels.containsKey(end)){
                buffer.setCharAt(posEnd, start);
                buffer.setCharAt(posStart,end);
                posStart++;
                posEnd--;
            }
            if (!vowels.containsKey(start)){
                posStart++;
            }
            if (!vowels.containsKey(end)){
                posEnd--;
            }
        }
        return buffer.toString();
    }
}
