
public class CutStick {
	public static void main(String[] args){
//int[] arr={5,4,4,2,2,8};
int[] arr={1,2,3,4,3,3,2,1};
solve(arr);
	}

	private static void solve(int[] arr) {
		int minlen=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0)
			minlen=Math.min(arr[i], minlen);
		}
		
		int count=0;

		for(int j=0;j<arr.length;j++){
			if(arr[j]>0){
			arr[j]=arr[j]-minlen;
			count++;
			}
			
		}
		System.out.println(count);
		for(int k=0;k<arr.length;k++){
		  if(arr[k]>0) solve(arr);	
		}
	}
}
