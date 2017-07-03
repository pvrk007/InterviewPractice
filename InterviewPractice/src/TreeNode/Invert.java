package TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//invert a tree
//logic is swap left and right use queue to go level wise

public class Invert {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        TreeNode first=root;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            TreeNode swap=temp.left;
            temp.left=temp.right;
            temp.right=swap;
            
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
        return first;
    }
}
