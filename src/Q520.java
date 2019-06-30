public class Q520 {
    public boolean detectCapitalUse(String word) {
        boolean captials=true, lowercase=true, firstCapital=true;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122){captials=false;break;}
        }

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>=65 && word.charAt(i)<=90){lowercase=false;break;}
        }

        if(word.charAt(0)>=97 && word.charAt(0)<=122)firstCapital=false;

        if(firstCapital){
            for(int i=1; i<word.length(); i++){
                if(word.charAt(i)>=60 && word.charAt(i)<=95)firstCapital=false;
            }
        }

        if(captials)return true;
        if(lowercase)return true;
        if(firstCapital)return true;
        return false;
    }
}
