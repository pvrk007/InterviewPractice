import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VariationAnagram {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		   
		   String line=sc.nextLine();
		   String[] words = line.replaceAll("[^a-zA-Z,]", "").toLowerCase().split(",");
		   if(words[0].length()!=words[1].length()){
			   System.out.println("Invalid Pattern");
			   continue;
		   }
		   int[] alphabets=new int[26];
		   for(int i=0;i<words[0].length();i++){
			   alphabets[words[0].charAt(i)-'a']++;
		   }
		   for(int i=0;i<words[1].length();i++){
			   alphabets[words[1].charAt(i)-'a']--;
		   }
		   for(int i=0;i<alphabets.length;i++){
			   if(alphabets[i]>0){
				System.out.println("Invalid Pattern");
				break;
			   }
			   if(i==alphabets.length-1){
				   System.out.println("Valid Pattern");
			   }
		   }
		   
		   
		   
		   
		   
	}
}
}
