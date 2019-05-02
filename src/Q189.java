public class Q189 {
    public void rotate(int[] nums, int k) {
        int [] rotated = new int[nums.length];
        for (int i = 0; i<rotated.length;i++){
            rotated[(i+k)%rotated.length] = nums[i];
        }
        for (int i = 0; i<rotated.length;i++){
            nums[i] = rotated[i];
        }

    }
}
