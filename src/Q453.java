import java.util.Arrays;

public class Q453 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int smallElem = nums[0];
        int moves = 0;
        for(int num:nums){
            moves += num-smallElem;
        }
        return moves;
    }
}
