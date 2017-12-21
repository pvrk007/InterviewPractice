import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problembloom {

	    public static void main(String[] args)
	    {

	       Scanner stdin = new Scanner(System.in);
	       int target=Integer.parseInt(stdin.nextLine());
	       List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	       int result=0;
	       for(int i=1;i<=5000;i++){
	           int j=0;
	           int k=5000;
	           while(j<=k){
	               int x=i*i;
	               int y=j*j;
	               int z=k*k;
	               
	               if(x+y+z==target){
	            	   
	            	   
	            		   ArrayList<Integer> sublist=new ArrayList<Integer>();
	            		   sublist.add(i);
	            		   sublist.add(j);
	            		   sublist.add(k);
	            		   Collections.sort(sublist);
	            		   if(!list.contains(sublist)){
	            			   System.out.println("i "+i+" j "+j+" k "+k+" x+y+z "+ (x+y+z));    
	                   result=result+i+j+k;
	                   list.add(sublist);
	                   
	            		   
	            	   }else{
	            		   j++;
	            	   }
	            	   
	               }else if(x+y+z>target){
	                   while(x+y+z>target){
	                	   k--;
	                	   z=k*k;
	                   }
	               }else{
	            	   while(x+y+z<target){
	            		   j++;
	            		   y=j*j;
	            	   }
	                   
	               }
	           }
	       }
	       System.out.println(result);
	       stdin.close();
	    }

	}

