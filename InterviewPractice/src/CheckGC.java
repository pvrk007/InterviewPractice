import java.util.Date;

public class CheckGC {
	public static void main(String [] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: "+ rt.totalMemory());
		System.out.println("Free JVM memory: "+ rt.freeMemory());
		Date d=null;
		for(int i=0;i<10000;i++){
			d=new Date();
			d=null;
		}
		System.out.println("Total JVM memory: "+ rt.totalMemory());
		System.out.println("After JVM memory: "+ rt.freeMemory());
	}
}
