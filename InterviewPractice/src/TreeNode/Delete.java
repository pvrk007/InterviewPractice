package TreeNode;

public class Delete {
//Given a root node reference of a BST and a key,
//delete the node with the given key in the BST. 
//Return the root node reference (possibly updated) of the BST.
	
// logic is find key if > root.val search right sub tree if < root.val search left subtree
//if == then check if left == null then return right subtree if right==null return left subtree
//else find min of right subtree and replace with the root key and delete min of right sub tree
	
	   public TreeNode deleteNode(TreeNode root, int key) {
		     if(root==null) return root;
		     if(root.val==key){
		         if(root.left==null){
		             return root.right;
		             
		         }else if(root.right==null){
		             return root.left;
		         }
		         root.val=min(root.right);
		         root.right=deleteNode(root.right,root.val);
		     }else if(root.val>key){
		         root.left=deleteNode(root.left,key);
		     }else if(root.val<key){
		         root.right=deleteNode(root.right,key);
		     }   
		     return root;
		    }
		    public static int min(TreeNode root){
		        while(root.left!=null){
		            root=root.left;
		        }
		        return root.val;	
}
}
