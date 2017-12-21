
public class CityDistance {
public static void main(String[] args){
	int[] t={9,1,4,9,0,4,8,9,0,1};
	int[] result=solution(t);
	for(int i=0;i<result.length;i++){
		System.out.println(result[i]);
	}
}

private static int[] solution(int[] t) {
	int[] distance=new int[t.length];
	for(int i=0;i<distance.length;i++){

		int temp=i;
	int d=0;
	int j=t[i];
	while(temp!=j){
	d++;
	
	temp=t[temp];
	j=t[temp];
	}
	

	distance[i]=d;
	}
	int[] result=new int[t.length-1];
	for(int k=1;k<result.length;k++){
	int num=0;
	for(int i=0;i<distance.length;i++){
	if(k==distance[i]){
	num++;
	}
	    }
	result[k-1]=num;
	}
	return result;
	
}
}
