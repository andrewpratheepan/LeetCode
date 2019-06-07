public class Q387 {
    public int firstUniqChar(String s) {
        int [] charArray = new int[256];
        for (char temp:s.toCharArray()){
            charArray[temp] += 1;
        }
        for (int i = 0; i<s.length(); i++){
            System.out.println(charArray[s.charAt(i)]);
            if (charArray[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
