import supportingFiles.Node;

import java.util.ArrayList;
import java.util.List;

public class Q429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        level(root, 0, list);
        return list;
    }
    public void level(Node root, int level, List<List<Integer>> list) {
        if(root == null)  return;
        if(list.size() < level+1){
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        for(Node n : root.children)
            level(n, level+1, list);
    }
}
