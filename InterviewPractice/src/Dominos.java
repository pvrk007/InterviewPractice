
public class Dominos {
public static void main(String[] args){
	String first="coffee";
	String second="eecoff";
    int result=0;
    while(result<first.length()){
      
      if(first.equals(second)){
        System.out.println(result);
      }
      result++;
      String a=first.charAt(first.length()-1)+"";
      System.out.println("last char "+a);
      first = first.substring(0, first.length() - 1);
      System.out.println("removing "+first);
      first=a+first;
      System.out.println("after "+first);
    }
 
    
    
    System.out.println(-1);
  
    import java.util.stream.*;
    import java.util.function.*;

    public class Utility {

        public static IntStream generateFibonacciSequence() {
            // To be implemented: Proper implementation.
         IntSupplier s = new IntSupplier() {
    			int previous = 1;
    			int current = 1;	
    			
    			@Override
    			public int getAsInt() {
    				int retval = previous;
    				int next = current + previous;
    				previous = current;
    				current = next;
    				return retval;
    			}
    		};
            return IntStream.generate(s);
        }

    }
}
}
