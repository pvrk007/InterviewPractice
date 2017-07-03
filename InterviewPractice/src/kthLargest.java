import java.util.PriorityQueue;

public class kthLargest {
	public static void main(String[] args){
		int[] nums={3,2,1,5,6,4};
		int k=2;
		System.out.println(findKthLargest(nums,k));
	}
	
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i=0;i<nums.length;i++){
            q.offer(nums[i]);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
