import java.util.ArrayList;
import java.util.List;

public class Q119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i = 0; i< rowIndex+1; i++){
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j<i+1; j++){
                innerList.add(new Integer(1));
            }
            for(int j = 1; j<innerList.size()-1;j++){
                innerList.set(j, returnList.get(i-1).get(j-1) + returnList.get(i-1).get(j));
            }
            returnList.add(innerList);
        }
        return returnList.get(rowIndex);
    }
}
