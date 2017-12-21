
public class Minesweeper {
	public static void main(String[] args){
		boolean[][] matrix={{true, false, false},
		                             {false, true, false},
		                             {false, false, false}};
		int[][] a=minesweeper(matrix);
	    for(int i=0;i<matrix.length;i++){
	        for(int j=0;j<matrix[0].length;j++){
	        	System.out.print(a[i][j]);
	        }
	        System.out.println("");
	    }
	
	}
	static int[][] minesweeper(boolean[][] matrix) {
		int [][] a=new int[matrix.length][matrix[0].length];
		    for(int i=0;i<a.length;i++){
		        for(int j=0;j<a[0].length;j++){
		            int val=0;
		            if(i-1>=0 && matrix[i-1][j]==true) val++;  
		            
		            if(i+1<matrix.length && matrix[i+1][j]==true) val++;
		            
		            if(j-1>=0 && matrix[i][j-1]==true) val++;
		           
		            if(j+1<matrix[0].length && matrix[i][j+1]==true) val++;
		            
		            if(i-1>=0 && j-1>=0 && matrix[i-1][j-1]==true)   val++;  
			            
		            if(i-1>=0 && j+1<matrix[0].length && matrix[i-1][j+1]==true)    val++;  
			            
		            if(i+1<matrix.length && j-1>=0 && matrix[i+1][j-1]==true) val++;
		            
		            if(i+1<matrix.length && j+1<matrix[0].length && matrix[i+1][j+1]==true) val++;
			            
		            a[i][j]=val;
		        }
		    }
		    return a;
		}
}
