public class Q283 {
    public void moveZeroes(int[] nums) {
        int realNum = 0;
        int temp = 0;
        for (int i = 0; i<nums.length;i++){
            temp = nums[i];
            if (temp != 0){
                nums[i] = 0;
                nums[realNum] = temp;
                realNum++;
            }
        }

    }
}
