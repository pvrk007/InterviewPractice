
public class maxcontinuosones {
	//Given a binary array, find the maximum number of consecutive 1s in this array.
	public static void main(String[] args){
		int[] a={1,0,1,1,1};
		int b=findMaxConsecutiveOnes(a);
		System.out.println(b);
	}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
              count=0;  
            } else{
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
