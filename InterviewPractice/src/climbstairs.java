
public class climbstairs {
	public static void main(String[] args){
		int a=climbStairs(5);
		System.out.println(a);
	}
    public static int climbStairs(int n) {
        int begin=0;
        int count=1;
        int result=0;
        for(int i=0;i<n;i++){
            result=count+begin;
            begin=count;
            count=result;
            
        }
        return result;
    }
}
