import java.util.Scanner;

public class Compressions {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int len=Integer.parseInt(sc.nextLine());
	System.out.println(len);
	for(int j=0;j<len;j++){
		 
		   String line=sc.nextLine();
		   String result="";
		   int count=1;
		   for(int i=0;i<line.length();i++){
			   
			   if(i+1<line.length() && line.charAt(i)==line.charAt(i+1)){
				   count++;
			   }else{
				   if(count!=1){
					   result+=count+""+line.charAt(i);   
				   }else{
					   result+=
							   line.charAt(i);
				   }
				   
				   count=1;
			   }
		   }
		   System.out.println(result);
	}
	sc.close();
}
}
