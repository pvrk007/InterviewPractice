import java.util.Scanner;

public class Binary {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len=Integer.parseInt(sc.nextLine());
		System.out.println(len);
		int[] arr=new int[len+1];
		int i=0;
		while(sc.hasNext() && i<len){
			arr[i]=Integer.parseInt(sc.nextLine());
			i++;
		}
	int target=Integer.parseInt(sc.nextLine());
		sc.close();
		
		int result=sortedsearch(arr,target);
		if(result!=-1){
			System.out.println("Correct");
			
		}else{
			System.out.println("Incorrect");
			System.out.println(len);
			
			for(int j=0;j<len;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
			System.out.print(target);
		}
		
		
	}

	private static int sortedsearch(int[] elements, int target) {
		if(elements==null || elements.length<=0) return -1;
		int left=0, right=elements.length-1;
		while(left<right){
			int middle=(left+right+1)/2;
			if(elements[middle]>target){
				right=middle-1;
			}else{
				left=middle+1;
			}
		}
		if(elements[right]==target) return right;
		return -1;
	}
}
