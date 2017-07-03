
public class LongestIncreasingSubsequence {
	
	public static void main(String [] args){
		int[] nums={9,2,4,5,14,12,213};
		int a=lengthOfLIS(nums);
		System.out.println(a);
	}
    public static int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int[] lis=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            lis[i]=1;
        }
        int max=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
                max=Math.max(lis[i],max);
            }
        }
        return max;
    }
}
