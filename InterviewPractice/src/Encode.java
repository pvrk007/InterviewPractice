import java.util.HashMap;

public class Encode {
public static void main(String[] args){
	System.out.println(Encode("yxyx"));
}

private static String Encode(String string) {
	StringBuilder sb =new StringBuilder();
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<string.length();i++){
		if(string.charAt(i)=='a' ||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u')	continue;
		    
			if(map.containsKey(string.charAt(i))){
				continue;
			}
			map.put(string.charAt(i), 1);
			sb.append(string.charAt(i));
			}
	String actual=sb.toString();
	StringBuilder result=new StringBuilder();
	for(int j=0;j<actual.length();j++){
		int a=1+(actual.charAt(j)-'a');
		int b=0;
        if(j+1<actual.length()){
        	b=1+(actual.charAt(j+1)-'a');
        }else{
        	b=1+(actual.charAt(0)-'a');
        }
        int c=a+b-1+'a';
        char d = (char)c;
        result.append(d);
       
	}
	
	return result.toString();
}
}
