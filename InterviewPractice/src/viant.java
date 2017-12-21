
public class viant {
public static void main(String args[]){
	//String[] source={"int a = 2;","int b = 47;/*37;*///41","int c = 3/*4//5*/;","return a / b *c/*a /* b / c*/;"};
	//String[] source={"int a = /*//2*/;"};
//	String[] source = {"var a = 2;", "/*", "var b = 2;", 
//	         "if (a === b) {", 
//	         "  b = a + 1;", 
//	         "  //b = a * 2 - 1;", 
//	         "}", 
//	          
//	         "var b = 3;", 
//	         "return a * b;"};
	
	String[] source = {"//1//1", 
	         "/2/", 
	         "x = 2//*/"};
	System.out.println(shortestSolutionLength(source));
}

private static int shortestSolutionLength(String[] source) {
	// TODO Auto-generated method stub
	int count=0;
	boolean commentStart=false;
     for(int i=0;i<source.length;i++){
    		
    		boolean doubleSlash=false;
    	 for(int j=0;j<source[i].length();j++){
    		 if(source[i].charAt(j)=='/'){
    			 if(j+1<source[i].length()){
    				 if(source[i].charAt(j+1)=='*'){
    					 commentStart=true;
    					 j++;
    					 continue;
    				 }
    			 }
    		 }
    		 if(source[i].charAt(j)=='/'){
    			 if(j+1<source[i].length()){
    				 if(source[i].charAt(j+1)=='/' && !commentStart){
    					 doubleSlash=true;
    				 }
    			 }
    		 }
    		 
    		 if(commentStart && source[i].charAt(j)=='*'){
    			 if(j+1<source[i].length()){
    				 if(source[i].charAt(j+1)=='/'){
    					 commentStart=false;
    					 j++;
    					 continue;
    				 }
    			 }
    		 }
    		 
    		 System.out.println(j+" "+source[i].charAt(j)+" "+commentStart );
    		 if(source[i].charAt(j)!=' ' && !commentStart && !doubleSlash){
    			count++;     	
    			
    		 }
    	 }
     }
     return count;
}
}
