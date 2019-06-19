public class Q482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder b = new StringBuilder();
        S = S.replaceAll("-","");
        if(S.equals("")) return S;
        int size = S.length();
        int section = size % K;
        int i = 0;
        for(i = 0; i <= section - 1; i++) {
            b.append(S.charAt(i));
        }
        while(i <= S.length() - 1) {
            b.append('-');
            for(int j = 0; j <= K -1; j++) {
                b.append(S.charAt(i+j));
            }
            i += K;
        }
        String rString = b.toString().toUpperCase();
        return section == 0 ? rString.substring(1) : rString;
    }
}
