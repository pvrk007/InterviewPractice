
public class numislands {
	// logic is do dfs in all directions keep tract of count
	public  void main(String [] args){
		char [][] grid={{1,1,1},{1,1,1},{1,1,1}};
		int b=numIslands(grid);
		System.out.println(b);
	}
    public static int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                    System.out.println("count "+count);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int i, int j){
        grid[i][j]='#';
        System.out.println(i+" "+j);
        if(i-1>=0 && grid[i-1][j]=='1') dfs(grid,i-1,j);
        if(j-1>=0 && grid[i][j-1]=='1') dfs(grid,i,j-1);
        if(i+1<grid.length && grid[i+1][j]=='1') dfs(grid,i+1,j);
        if(j+1<grid[0].length && grid[i][j+1]=='1') dfs(grid,i,j+1);

    }
}
