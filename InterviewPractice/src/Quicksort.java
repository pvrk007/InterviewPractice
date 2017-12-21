
public class Quicksort {
public static void main(String[] args){
	int[] arr={10,30,40,90,80,50,70};
	sort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}

private static void sort(int[] arr, int low, int high) {
	int pivot=arr[high];
	int i=low-1;
	for(int j=i;j<=high-1;j++){
		if(arr[j]<=pivot){
			i++;
			swap(arr,i,j);
		}
	}
	swap(i+1,high);
	sort()
	
}

}
