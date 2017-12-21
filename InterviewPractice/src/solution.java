import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class solution {
	public static void main(String[] args){
//	HashMap<Integer,Integer> attribute1=new HashMap<Integer,Integer>();
//	HashMap<Character,String> attribute2=new HashMap<Character,String>();
//	HashMap<Character,String> attribute3=new HashMap<Character,String>();
//	attribute1.put(1, 1);
//	attribute1.put(2, 2);
//	attribute1.put(3, 3);
//	attribute2.put('E', "Empty");
//	attribute2.put('F', "Filled");
//	attribute2.put('S', "Striped");
//	attribute2.put('E', "Empty");
//	attribute2.put('F', "Filled");
//	attribute2.put('S', "Striped");
//	
//	
		String result=new String();
		String s1="3FPS";
		String s2="3SRS";
	for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)==s2.charAt(i)){
			result=result+s1.charAt(i);
		}else{
			if(s1.charAt(i)=='E'||s1.charAt(i)=='F'||s1.charAt(i)=='S'){
				if(s1.charAt(i)=='E'){
					if(s2.charAt(i)=='F'){
						result=result+'S';
					}else{
						result=result+'F';
					}
				}
				if(s1.charAt(i)=='F'){
					if(s2.charAt(i)=='E'){
						result=result+'S';
					}else{
						result=result+'E';
					}
				}
				if(s1.charAt(i)=='S'){
					if(s2.charAt(i)=='E'){
						result=result+'F';
					}else{
						result=result+'E';
					}
				}
				
			}
			if(s1.charAt(i)=='E'||s1.charAt(i)=='F'||s1.charAt(i)=='S'){
				if(s1.charAt(i)=='E'){
					if(s2.charAt(i)=='F'){
						result=result+'S';
					}else{
						result=result+'F';
					}
				}
				if(s1.charAt(i)=='F'){
					if(s2.charAt(i)=='E'){
						result=result+'S';
					}else{
						result=result+'E';
					}
				}
				if(s1.charAt(i)=='S'){
					if(s2.charAt(i)=='E'){
						result=result+'F';
					}else{
						result=result+'E';
					}
				}
				
			}
		}
	}
	
	
	}
}
