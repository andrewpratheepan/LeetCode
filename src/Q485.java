public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int previousMax = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                max++;
            }
            else {
                previousMax = previousMax>max ? previousMax:max;
                max = 0;
            }
        }
        return previousMax>max ? previousMax:max;
    }
}
