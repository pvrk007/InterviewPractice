
public class HelloThread extends Thread {

    public void run() {
    	for(int i=0;i<10;i++){
        System.out.println("Hello from a thread! "+i);
        
    	}
    }

    public static void main(String args[]) {
        HelloThread t=new HelloThread();
        t.start();
        HelloThread t1=new HelloThread();
        t1.start();
    }

}


