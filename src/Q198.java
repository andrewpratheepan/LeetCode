public class Q198 {
    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        int previous1 = 0;
        int previous2 = 0;
        int temp = 0;
        for (int i = 0; i<nums.length;i++){
            temp = previous1;
            previous1 = Math.max(previous2+nums[i],temp);
            previous2 = temp;
        }
        return previous1;
    }
}
