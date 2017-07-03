import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
	public static void main(String[] args){
		  MyStack obj = new MyStack();
		  obj.push(10);
		  int param_2 = obj.pop();
		  int param_3 = obj.top();
		  boolean param_4 = obj.empty();
		  System.out.println(param_2+" "+param_3+" "+param_4);
	}
	
	public static class MyStack {
	    Queue<Integer> q;

	    /** Initialize your data structure here. */
	    public MyStack() {
	        q=new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        int size=q.size();
	        q.offer(x);
	        for(int i=0;i<size;i++){
	            q.offer(q.poll());
	        }
	        
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        return q.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	       return q.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        if(q.size()==0) return true;
	        return false;
	    }
	}

}
