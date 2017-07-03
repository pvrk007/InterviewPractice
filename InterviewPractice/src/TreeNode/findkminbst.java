package TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Kth Smallest Element in a BST
//Do inorder traversal and return k-1
public class findkminbst {
	  public int kthSmallest(TreeNode root, int k) {
	        List<Integer> list=new ArrayList<Integer>();
	        Stack<TreeNode> stack=new Stack<TreeNode>();
	        TreeNode p=root;
	        while(!stack.isEmpty() || p!=null){
	            if(p!=null){
	                stack.push(p);
	                p=p.left;
	            }else{
	                TreeNode temp=stack.pop();
	                list.add(temp.val);
	                if(temp.right!=null){
	                    p=temp.right;
	                }
	            }
	        }
	        return list.get(k-1);
	    }
}
