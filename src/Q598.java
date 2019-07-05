public class Q598 {
    public int maxCount(int m, int n, int[][] ops) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for (int i=0; i<ops.length; i++){
            if (ops[i].length>0){
                if (ops[i][0]<x) x = ops[i][0];
                if (ops[i][1]<y) y = ops[i][1];
            }
        }
        if (m<x) x=m;
        if (n<y) y=n;
        return x*y;
    }
}
