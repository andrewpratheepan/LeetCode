import supportingFiles.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int depth = 0;
        stepIn(root,list,depth);
        Collections.reverse(list);
        return list;
    }

    private void stepIn(TreeNode root, List<List<Integer>> list, int depth) {
        if (root == null)return;
        if (list.size()-1<depth){
            list.add(depth, new ArrayList<>());
        }
        list.get(depth).add(root.val);
        depth++;
        stepIn(root.left, list, depth);
        stepIn(root.right, list, depth);
    }
}
