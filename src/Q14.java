public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        StringBuffer temp = new StringBuffer();
        char placeholder;
        for (int i = 0; i<strs[0].length();i++){
            placeholder = (strs[0].charAt(i));
            for (int j = 1; j<strs.length;j++){
                if (strs[j].length()<=i){
                    return temp.toString();
                }
                if (strs[j].charAt(i) == placeholder){

                }
                else{
                    return temp.toString();
                }
            }
            temp.append(placeholder);
        }
        return temp.toString();
    }
}
