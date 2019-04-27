public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int [] para = new int[2];
        for (int i = 0; i<numbers.length-1; i++){
            for (int j = i+1; j<numbers.length;j++){
                if (numbers[i] + numbers[j] == target) {
                    para = new int[]{++i,++j};
                    return para;
                }
            }
        }
        return para;
    }
}
