package TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Validate {
	public static void main(String[] args){
		TreeNode t=new TreeNode(0);
		boolean l=isValidBST(t);
		System.out.println(l);
		/*Validate BST logic is do in order traversal and check if increasing order */
	}
	
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode p=root;
        while(!stack.isEmpty()||p!=null){
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
        for(int i=1;i<list.size();i++){
        if(list.get(i-1)>=list.get(i)){
            return false;
        }
            
        }
        return true;
    }
}
