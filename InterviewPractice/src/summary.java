
public class summary {
public static void main(String[] args){
	int a=4,b=0;
	int c=divide(a,b);
	System.out.println(c);
}

private static int divide(int a, int b) {
	// TODO Auto-generated method stub
	int c=-1;
	try{
		c=a/b;
	}catch(Exception e){
		System.err.print("Exception");
	}finally{
		System.err.println("Finally");
	}
	return c;
}
}
