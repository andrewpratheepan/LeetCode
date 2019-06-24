public class Q504 {
    public String convertToBase7(int num) {
        StringBuilder build = new StringBuilder();
        if (num == 0) return "0";
        int remainder = 0;
        boolean flag = false;
        if (num<0){
            flag = true;
            num*=-1;
        }
        while (num>0){
            remainder = num % 7;
            build.append(remainder);
            num/=7;
        }
        if (flag) build.append("-");
        return build.reverse().toString();
    }
}
