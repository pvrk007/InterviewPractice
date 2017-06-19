import TreeNode.TreeNode;

public class arraytotree {


public TreeNode sortedArrayToBST(int[] nums) {
	TreeNode root=arraytotre(nums,0,nums.length-1);
	return root;

}

private TreeNode arraytotre(int[] nums, int lo, int hi) {
	if(lo>hi) return null;
	int mid=lo+(hi-lo)/2;
	TreeNode root= new TreeNode(nums[mid]);
	root.left= arraytotre(nums,lo,mid-1);
	root.right=arraytotre(nums,mid+1,hi);
	
	return root;
}
}