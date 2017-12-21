import java.util.Scanner;

public class PalindromePhrase {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		   
		   String line=sc.nextLine();
		   
		   String longest=longestPalindrome(line);
		  System.out.println(longest.replaceAll("[^a-zA-Z,\\s+]", "").trim());
}
}

public static String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
		return s;
	String result="";
    for (int i = 0; i < len-1; i++) {
     	String a=extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
     	if(a.length()>result.length()){
     		result=a;
     	}
     	if((i+1)>=(len-1)){
     		String b=extendPalindrome(s, i, i+1); //assume even length.
     		if(b.length()>result.length()){
         		result=b;
         	}
     	}
     	
    }
    return result;
}

private static String extendPalindrome(String s, int j, int k) {
     String a=s.toLowerCase();
	while (j >= 0 && k < s.length() && a.charAt(j) == a.charAt(k)) {
		j--;
		k++;
		while(j>=0 && (a.charAt(j)-'a'>26 || a.charAt(j)-'a'<0)) j--;
		while(k < s.length() && (a.charAt(k)-'a'>26 || a.charAt(k)-'a'<0)) k++;
	}
	return s.substring(j+1, k);
}
}