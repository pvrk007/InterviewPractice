
public class Findroot {
public static void main(String[] arg){
	int a=1;
	int b=root(a);
	System.out.println(b);
}

private static int root(int a) {
	if(a<0) return 0;
    int hi=a;
    int lo=0;
    while(lo<hi){
    	int mid=lo+(hi-lo)/2;
    	System.out.println(mid);
    	int num=mid*mid;
    	if(num==a){
    		return mid;
    	}else if((num)<a){
    		if((mid+1)*(mid+1)>a){
    		return mid;
    		}else{
    			lo=mid+1;
    		}
    	}else if(num>a){
    		hi=mid-1;
    	}
    }
    return lo;
}
}
