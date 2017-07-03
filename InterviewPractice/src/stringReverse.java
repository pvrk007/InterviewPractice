
public class stringReverse {
	public static void main(String[] args){
		String s="hello";
		String reverse=reverseString(s);
		System.out.println(reverse);
	}
    public static String reverseString(String s) {
        StringBuilder reverse=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        
        return reverse.toString();
    }
    
}
