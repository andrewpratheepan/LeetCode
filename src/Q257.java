import supportingFiles.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        return binaryTreePaths(root, list, "");
    }
    public List<String> binaryTreePaths(TreeNode root, List<String> list, String path) {
        if (root == null) {return list;}
        path += root.val;
        if (root.left == null && root.right == null) {list.add(path);}
        else {path+="->";}
        binaryTreePaths(root.left, list, path);
        return binaryTreePaths(root.right, list, path);
    }
}
