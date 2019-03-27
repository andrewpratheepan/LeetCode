public class Q38 {
    public String countAndSay(int n) {
        int count=0;
        if (n==1){
            return "1";
        }
        StringBuffer b = new StringBuffer();
        String temp = countAndSay(--n);
        for (int i=0; i<temp.length();i++){
            count=1;
            char add = temp.charAt(i);
            while(i < temp.length()-1 && add == temp.charAt(i+1)) {
                count++;
                i++;
            }
            b.append(count+""+add);

        }
        return b.toString();
    }
}
