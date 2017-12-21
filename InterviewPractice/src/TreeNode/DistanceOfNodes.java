package TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistanceOfNodes {

	public static void main(String[] args){
        String inputStr="awaglknagawunagwkwagl";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<String> list=new ArrayList<String>();
		int i=0;
        for(int j=1;j<inputStr.length();++j){
        	if (map.containsKey(inputStr.charAt(j-1))){
        		 if((j-i)==4){
        			  boolean containsUnique = false;
        			   for(char c : inputStr.substring(i,j-1).toCharArray()){
        			        if(inputStr.indexOf(c) == inputStr.lastIndexOf(c)){
        			            containsUnique = true;
        			        } else {
        			            containsUnique = false;
        			        }
        			    }
        			   if(containsUnique){
        				   list.add(inputStr.substring(i,j));
        				   System.out.println(inputStr.substring(i,j));
        			   }
                    
        		 }
        		i = Math.max(i, map.get(inputStr.charAt(j-1))+1);
            }
            map.put(inputStr.charAt(j-1),j-1);
            if((j-i)==4){
                System.out.println(inputStr.substring(i,j));
                list.add(inputStr.substring(i,j));
                map.remove(inputStr.charAt(i));
                i++;
                
            }
        	
        }
		
	}

	
}
