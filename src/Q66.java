public class Q66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length-1;
        digits[len] += 1;
        for (int i = len; i >= 0; i--){
            digits[i] += carry;
            carry = digits[i]/10;
            digits[i]-=carry*10;
        }
        if (carry==1){
            int [] newDigits = new int[len+2];
            newDigits[0] = 1;
            for (int i = 0; i<len; i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
