import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i = 0; i< numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j<i+1; j++){
                innerList.add(new Integer(1));
            }
            for(int j = 1; j<innerList.size()-1;j++){
                innerList.set(j, returnList.get(i-1).get(j-1) + returnList.get(i-1).get(j));
            }
            returnList.add(innerList);
        }
        return returnList;
    }
}
