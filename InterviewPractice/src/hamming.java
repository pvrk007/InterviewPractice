
public class hamming {
	public static void main(String[] args){
		int a=0;
		int b=128;
		int c=hammingDistance(a,b);
		System.out.println(c);
	}
	   public static int hammingDistance(int x, int y) {
	        int z=x^y;
	        int count=0;
	        while(z>0){
	        	System.out.println(z);
	            count+=z&1;
	            z>>=1;
	        }
	        return count;
	    }
}
