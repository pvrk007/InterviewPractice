
public class Kias {
public static void main(String[] args){
	int[] a={-1,-1};
	System.out.println(solve(a));
}

private static int solve(int[] a) {
	int[][] grid=new int[a.length][a.length];
	for(int i=0;i<a.length;i++){
		int row=a[i];
		if(row>=0){
	
		grid[i][row]=1;
		}
	}

	
	System.out.println("");
	int predators=0;
	for(int i=0;i<grid.length;i++){
		for(int j=0;j<grid.length;j++){
		  if(grid[i][j]==1){
			  predators++;
			  predators=dfs(grid,predators,j);
			  
			  
		  }
		}
	}
	return predators==0?1:predators;
	
	
}

private static int dfs(int[][] grid, int predators, int j) {
	  for(int k=0;k<grid.length;k++){
		  if(grid[j][k]==1){
			  predators++;
			  
			  dfs(grid,predators,k);
		  }
	  }
	  return predators;
	
}
}
