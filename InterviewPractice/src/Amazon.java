import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import TreeNode.TreeNode;

public class Amazon {
	public static void main(String[] args){
		int[]values={5,6,3,1,2,4};
		int a=bstDistance(values,6,1,2);
	}
	  public static int bstDistance(int[] values, int n, int node1, int node2)
{
// WRITE YOUR CODE HERE
TreeNode root=new TreeNode(values[0]);
for(int i=1;i<values.length;i++){
    root=insert(root,values[i]);
}

return node2;

}
	  public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> list = new LinkedList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        if(root == null) return list;
	        while(root != null) {
	            while(root.left != null) {
	                stack.push(root);
	                root = root.left;
	            }
	            list.add(root.val);
	            while(root.right == null) {
	                if(!stack.isEmpty()) {
	                    root = stack.pop();
	                    list.add(root.val);
	                } else {
	                    break;
	                }
	            }
	            if(root.right != null) {
	                root = root.right;
	            } else if(stack.isEmpty()) {
	                break;
	            }
	        }
	        return list;
	    }
	private static TreeNode insert(TreeNode root, int i) {
		// TODO Auto-generated method stub
		 if (root == null) {
	            root = new TreeNode(key);
	            return root;
	        }
		
		if(i<root.val){
			root.left=insert(root.left, i);
		}else{
			root.right=insert(root.right,i);
		}
		return root;
	}
}
