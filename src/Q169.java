public class Q169 {
    public int majorityElement(int[] nums) {
        double limit = Math.floor(nums.length/2);
        int count = 0;
        for (int num:nums){
            for (int check:nums){
                if (check == num) count++;
            }
            if (count>limit){
                return num;
            }
            count = 0;
        }
        return Integer.MIN_VALUE;
    }
}
