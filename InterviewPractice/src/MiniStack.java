import java.util.Stack;

public class MiniStack {
	public class MinStack {
	    Stack<Integer> stack;
	    int min=Integer.MAX_VALUE;

	    /** initialize your data structure here. */
	    public MinStack() {
	        stack=new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        
	        if(min>=x){
	            stack.push(min);
	            min=x;
	        }
	        stack.push(x);
	    }
	    
	    public void pop() {
	        int a=stack.pop();
	        if(a==min){
	            min=stack.pop();
	        }
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return min;
	    }
}
}
