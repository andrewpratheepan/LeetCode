import java.util.ArrayList;
import java.util.List;

public class Q401 {
    public List<String> readBinaryWatch(int num) {
        int[] base2 = {8,4,2,1,32,16,8,4,2,1};
        List<String> times = new ArrayList<>();
        int h=0,min=0;
        backtrack(num,base2,times,h,min,0);
        return times;
    }

    public void backtrack(int n, int[] base2, List times,int h,int min, int start) {
        if (h>11 || min>59) return;
        if (n==0) {
            String s = (min<10)?(h+":"+"0"+min):(h+":"+String.valueOf(min));
            times.add(s);
            return;
        }
        for (int i=start;i<base2.length;i++) {
            if(i<=3) h+=base2[i];
            else min+=base2[i];
            backtrack(n-1,base2,times,h,min,i+1);
            if(i<=3) h-=base2[i];
            else min-=base2[i];
        }
    }
}
