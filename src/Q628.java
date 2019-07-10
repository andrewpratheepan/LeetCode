import java.util.Arrays;

public class Q628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(
                nums[0] * nums[1] * nums[nums.length - 1], //two large negatives and a positive (product positive)
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]); //three largest values
    }
}
