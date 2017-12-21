
public class points {
public static void main(String[] args){
	System.out.println(canReach(1,2,2,1));
	int [] a={1,2,3,4};
	System.out.println(kSub(3,a));
}

private static boolean canReach(int i, int j, int k, int l) {
	if(i>k || j>l){
		return false;
	}
	
	if(i==k && j==l) return true;
	
	return canReach(i+j,j,k,l) || canReach(i,j+i,k,l);


}

static long kSub(int k, int[] nums) {
	  long[] modNumber = new long[k];
		for(int i = 0; i < k; i++)
		{
			modNumber[i] = 0;
		}
		modNumber[0] = 1;

		int prefSum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			prefSum += nums[i];
			prefSum %= k;
			modNumber[prefSum] += 1;
		}

		long result = 0;
		for(int mod = 0; mod < k; mod++)
		{
			result += modNumber[mod] * (modNumber[mod] - 1) / 2;
		}
		return result;
	}
}
