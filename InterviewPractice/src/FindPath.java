import java.util.Scanner;

public class FindPath {
	public static void main(String[] args){
//		String s="SNICKERDOODLE";
//		char[][] grid={{'S','N','I','C','K','E'},
//				       {'N','R','C','R','D','O'},
//				       {'I','E','K','O','D','S'},
//				       {'C','R','D','O','L','E'}};
		String s="GZQFMCFWHSSXPUZAJMQOAHNFZWJCOJVW";
		char[][] grid={{'G','Z','X','W','V','Y','K','V','X','J','T','Z','E'},
			           {'F','Q','A','O','V','Y','B','V','H','Q','C','U','C'},
			           {'M','C','F','W','H','S','S','X','P','S','Z','X','W'},
			           {'Z','P','G','K','W','S','L','D','U','N','S','I','F'},
			           {'E','X','C','K','N','D','S','B','Z','A','J','U','E'},
		               {'O','K','K','I','C','A','O','V','D','W','M','Q','A'},
			           {'N','W','H','D','J','D','M','P','L','H','F','O','S'},
			           {'P','C','T','Z','K','P','P','G','V','C','H','A','V'},
			           {'B','V','Z','N','P','K','P','S','O','M','N','F','R'},
			           {'A','V','H','D','Z','G','M','I','W','Z','F','I','S'},
			           {'U','G','I','A','E','G','N','P','F','W','J','L','A'},
			           {'F','H','J','P','W','F','W','P','Q','G','C','O','J'},
			           {'K','L','S','E','C','L','Q','Z','I','T','Y','T','V'},
			           {'D','F','H','H','J','L','L','A','W','Z','G','A','W'}};
		 char[][] result= findPath(s,grid);
		 for(int i=0;i<result.length;i++){
			 for(int j=0;j<result[0].length;j++){
				 if(result[i][j]-'A'<0){
					 System.out.print(".");
				 }else{
				 System.out.print(result[i][j]);
				 }
			 }
			 System.out.println("");
		}
	}

	private static char[][] findPath(String s, char[][] grid) {
		char[][] result=new char[grid.length][grid[0].length];
		totalPath(s,grid,0,0,0,result);
		
		return result;
	}

	private static boolean totalPath(String s, char[][] grid, int i, int j, int k, char[][] result) {
		// TODO Auto-generated method stub
		if(k==s.length()-1  && s.charAt(k)==grid[i][j]){
			result[i][j]=grid[i][j];
			return true;
		}
		if(s.charAt(k)==grid[i][j]){
			if(i+1<grid.length && totalPath(s,grid,i+1,j,k+1,result)){
				result[i][j]=grid[i][j];
				return true;
			}
			if(i-1>=0 && totalPath(s,grid,i-1,j,k+1,result)){
				result[i][j]=grid[i][j];
				return true;
			}
			if(j+1<grid[0].length && totalPath(s,grid,i,j+1,k+1,result)){
				result[i][j]=grid[i][j];
				return true;
			}
			if(j-1>=0 && totalPath(s,grid,i,j-1,k+1,result)){
				result[i][j]=grid[i][j];
				return true;
			}
		}else{
			return false;
		}
		return false;
		
	}
}
