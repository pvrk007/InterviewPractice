
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
    	HelloRunnable runner=new HelloRunnable(); 
    	Thread t = new Thread(runner);
    	t.start();
    }

}