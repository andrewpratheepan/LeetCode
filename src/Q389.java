import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q389 {
    public char findTheDifference(String s, String t) {
       char[] sA = s.toCharArray();
       char[] tA = t.toCharArray();
       Arrays.sort(sA);
       Arrays.sort(tA);
       char lastT = tA[tA.length-1];
       for (int i = 0; i < sA.length; i++) {
           if (sA[i] != tA[i]) return tA[i];
       }
       return lastT;
    }
}
