import java.util.Scanner;

public class ReverseWords{
		   public static void main(String[] args){
		   Scanner sc=new Scanner(System.in);
		   int nLines = Integer.valueOf(sc.nextLine());
		   for(int i=0;i<nLines;i++){
		   String line=sc.nextLine();
		   String[] words = line.split(" ");
		   String reversed="";
		   for(int j= words.length-1;j>=0;j--){
		   reversed+= " "+words[j];
		   }
		   System.out.println("Case #"+i+":"+reversed);
		   }
		}
}

