package TreeNode;

public class maxDepth {
    public int maxdepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxdepth(root.left);
        int right=maxdepth(root.right);
        return 1+Math.max(left,right);
    }
}
