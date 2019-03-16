public class Q7 {
    public int reverse(int x) {
        if (x==0){
            return 0;
        }
        int sign = x/Math.abs(x);
        x = Math.abs(x);
        int div = 10;
        StringBuffer temp = new StringBuffer();
        while (x>0){
            temp.append(x%div);
            x /= div;
        }try{
            return Integer.parseInt(temp.toString())*sign;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
