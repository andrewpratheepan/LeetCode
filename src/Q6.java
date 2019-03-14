public class Q6 {//WIP
    public String convert2(String s, int numRows) {
        if (numRows == 0 || s.equals("") || s == null) {
            return "";
        }
        String temp = "";
        int trigger = (numRows - 1) * 2;
        for (int i = 0; i < s.length(); i += trigger) {
            temp += s.charAt(i);
            if (trigger==0){
                break;
            }
        }
        return temp + convert2(s.substring(1), numRows - 1);
    }

    public String convert(String s, int numRows) {
        if (numRows==1)
            return s;
        int len = s.length();
        int cycle = (numRows - 1)*2;
        String temp = "";
        for (int i = 0; i<numRows; i++){

        }


    }

}
