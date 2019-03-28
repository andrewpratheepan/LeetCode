public class Q58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        if (arr.length == 0){
            return 0;
        }
        return arr[arr.length-1].length();
    }
}
