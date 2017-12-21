import java.util.ArrayList;
import java.util.List;

public class Threearray {
public static void main(String[] args){
	int [] arr1={10,9,8,7};
	int [] arr2={6,5,4,3};
	int [] arr3={2,1};
	List<Integer> result=topten(arr1,arr2,arr3);

	int size=result.size();

	for(int i=0;i<size;i++){
		System.out.println(result.get(i));
	}
}

public static List<Integer> topten(int [] arr1,int [] arr2, int [] arr3){
	int i=0, j=0,k=0;
	ArrayList<Integer> list=new ArrayList<Integer>();//return the list
	while(list.size()<10){
		int a=i<arr1.length?arr1[i]:Integer.MIN_VALUE;//take first array element
		int b=j<arr2.length?arr2[j]:Integer.MIN_VALUE;//take second array element
		int c=k<arr3.length?arr3[k]:Integer.MIN_VALUE;//take third array element
	   int highest=Math.max(a, Math.max(b, c));// compare the values take the highest
	   if(highest==Integer.MIN_VALUE){
		   return list;
	   }
      //add the highest to list since in descending order just increase the index for next element
    	   list.add(highest);   
	   
	   
	   if(highest==a){
		   i++;
	   }else if(highest==b){
		   j++;
	   }else if(highest==c){
		   k++;
	   }
	}
	return list;
	
}
}
