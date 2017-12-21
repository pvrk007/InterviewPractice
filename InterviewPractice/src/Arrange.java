import java.util.Scanner;

public class Arrange {
    public static void main(String[] args)
    {

       Scanner stdin = new Scanner(System.in);
       int rotations=Integer.parseInt(stdin.nextLine());
       String setter=stdin.nextLine();
       String intial=stdin.nextLine();
       String Side=stdin.nextLine();
       
       String[] arr=intial.split(" ");
       String[][] order={{arr[3],arr[2],arr[1]},{arr[4],arr[5],arr[0]}};
       for(int i=0;i<order.length;i++){
    	   System.out.println("");
    	   for(int j=0;j<order[0].length;j++){
    		   
    		   System.out.print(" "+order[i][j]);
    	   }
    	   
    	   }
       
	   String[] sideorder=Side.replaceAll("\\d","").trim().split(" ");
	   System.out.println("");
	   
	   for(int k=0;k<sideorder.length;k++){
		   System.out.print(sideorder[k]);
       }
	   
	   for(int k=0;k<rotations;k++){
		if(!order[0][2].equals(setter)){
			String temp=sideorder[0];
			for(int l=0;l<sideorder.length;l++){
				   if(l+1!=sideorder.length){
				   sideorder[l]=sideorder[l+1];
				   }else{
					   sideorder[l]=order[0][2];
				   }
			   }
		   order[0][2]=order[0][1];
		   order[0][1]=order[0][0];
		   order[0][0]=order[1][0];
		   order[1][0]=order[1][1];
		   order[1][1]=order[1][2];
		   order[1][2]=temp;
		}else{
			   order[0][2]=order[0][1];
			   order[0][1]=order[0][0];
			   order[0][0]=order[1][0];
			   order[1][0]=order[1][1];
			   order[1][1]=order[1][2];
			   order[1][2]=setter;
		}
		System.out.println("");
		   for(int i=0;i<order.length;i++){
	    	   System.out.println("");
	    	   for(int j=0;j<order[0].length;j++){
	    		   
	    		   System.out.print(" "+order[i][j]);
	    	   }
	    	   
	    	   }
		   System.out.println("");
		   for(int l=0;l<sideorder.length;l++){
			   System.out.print(sideorder[l]);
		   }
		   }
	   
	   System.out.println("");
	   System.out.println(order[1][2]+" "+order[0][2]+" "+order[0][1]+" "+order[0][0]+" "+order[1][0]+" "+order[1][1]);
       stdin.close();
    }
}
