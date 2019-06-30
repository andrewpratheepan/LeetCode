public class Q557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder build = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        for (String str:arr){
            buffer.append(str).reverse();
            build.append(buffer.toString());
            buffer.delete(0,buffer.length());
            build.append(" ");
        }
        build.delete(build.length()-1,build.length());
        return build.toString();
    }
}
