import java.util.HashMap;
import java.util.HashSet;

public class coursera {
public static void main(String[] args){
  int[] arr={1,2,2};
  System.out.println(minUniqueArraySum(arr));
  System.out.println(minUniqueArrayhashSum(arr));
}

private static int minUniqueArrayhashSum(int[] arr) {
	int result=0;
	HashSet<Integer> map=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++){
	if(map.add(arr[i])){
		  result+=arr[i];	
		}else{
			
			while(map.contains(arr[i])){
				arr[i]++;
			}
			map.add(arr[i]);
			result+=arr[i];
		}
	}
	return result;
}

private static int minUniqueArraySum(int[] arr) {
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length-1;i++){
		map.put(arr[i], 1);
		for(int j=i+1;j<arr.length;j++){
			while(map.containsKey(arr[j])){
				arr[j]++;
			}
		}
	}
	int result=0;
	for(int i=0;i<arr.length;i++){
		result+=arr[i];
	}
	return result;
}
}
