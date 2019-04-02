public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] merged = new int[nums1.length];
        int m1=0,n1=0;
        for (int i = 0; i<m+n; i++){
            if (m1==m || n1 == n){
                break;
            }
            if (nums1[m1] < nums2[n1]){
                merged[i] = nums1[m1++];
            }
            else{
                merged[i] = nums2[n1++];
            }
        }
        if (m1 == m) {
            for (int i = n1; i < n; i++){
                merged[i+m] = nums2[i];
            }
        }
        if (n1 == n){
            for (int i = m1; i < m; i++){
                merged[i+n] = nums1[i];
            }
        }
        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }
    }
}
