
public class Maxsumsubarray {
	public static void main(String[] args)
	{
	int arr[] = { 1,2,3,4,5};
	
	int sum = 11;

	System.out.println(findMaxSubarraySum(arr, sum));
	}
	  public static int findMaxSubarraySum(int arr[], int sum)
     {
		  int maxcount=-1;
		  
		  int currsum=0;

		  int start=0;
		  int end=0;
		  for(int i=0;i<arr.length;i++){
			  currsum+=arr[i];
			  end+=1;
			  while(currsum>sum){
				  currsum-=arr[start];
				  start++;
			  }
			  if(currsum<=sum){
				  maxcount=Math.max(maxcount, end-start);
			  }
		  }
		  return maxcount;
}

}
