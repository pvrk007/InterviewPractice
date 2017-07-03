package TreeNode;
// Lowest Common Ancestor of a Binary Search Tree
public class lca {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val<p.val && root.val<q.val)
        return lowestCommonAncestor(root.right,p,q);
        
        else if(root.val>p.val && root.val>q.val)
        return lowestCommonAncestor(root.left,p,q);
        
        return root;
    }

}
