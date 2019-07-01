import supportingFiles.Node;

public class Q559 {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        int max = 1;
        for (Node node : root.children){
            int level = maxDepth(node) + 1;
            if(level > max) {
                max = level;
            }
        }
        return max;
    }
}
