package TreeNode;
/*return true if same trees logic if each node not equal or if either is null then false 
 * if both are null its ok */
public class isSame {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null) return false;
        if(q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
