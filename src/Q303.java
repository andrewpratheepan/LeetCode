import java.util.HashMap;
import java.util.Map;

public class Q303 {
    int[] numArray;
    int[] sumArray;
    public Q303(int[] nums) {
        numArray = nums;
        sumArray = new int[nums.length+1];
        for (int i = 0; i<sumArray.length;i++){
            sumArray[i+1] = sumArray[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sumArray[j+1]-sumArray[i];
    }
}
/*
class NumArray {
    int[] numArray;
    int[] sum;
    public NumArray(int[] nums) {
    sum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
        sum[i + 1] = sum[i] + nums[i];
    }
}

public int sumRange(int i, int j) {
    return sum[j + 1] - sum[i];
}
}

 */