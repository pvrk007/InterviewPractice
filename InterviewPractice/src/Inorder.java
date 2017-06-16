import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import TreeNode.TreeNode;

public class Inorder {
	public static void main(String[] args){
		TreeNode t=new TreeNode(0);
		List<Integer> l=inorderTraversal(t);
		System.out.println(l.get(0));
		/*Inorder traversal is left root right so logic is push left when null pop and check right */
	}

	
    public static List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> list=new ArrayList<Integer>();
     Stack<TreeNode> stack=new Stack<TreeNode>();
     TreeNode p=root;
     while(!stack.isEmpty()|| p!=null){
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
     return list;
    }
}
