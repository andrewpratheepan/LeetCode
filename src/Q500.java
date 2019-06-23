import java.util.ArrayList;
import java.util.List;

public class Q500 {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[qwertyuiopQWERTYUIOP]+|[asdfghjklASDFGHJKL]+|[zxcvbnmZXCVBNM]+")){ //regex
                list.add(words[i]);
            }
        }
        String[] arr = list.toArray(new String[list.size()]);
        return arr;
    }
}
