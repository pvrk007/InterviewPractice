
public class friends {
	//There are N students in a class. Some of them are friends, while some are not. 
	//Their friendship is transitive in nature. For example,
	//if A is a direct friend of B, and B is a direct friend of
	//C, then A is an indirect friend of C. And we defined a friend 
	//circle is a group of students who are direct or indirect friends.
//Given a N*N matrix M representing the friend relationship between students in the class. 
	//If M[i][j] = 1, then the ith and jth students are direct friends with each other, 
	//otherwise not. And you have to output the total number of friend circles among all the students.
	
	
	//logic have an array visited of length friends then if ==0 then do dfs and find all interconnected and 
	//put it as visited
	//have a count no of times dfs is called and return count
	public static void main(String [] args){
		int [][] grid={{1,1,1},{1,1,1},{1,1,1}};
		int b=findCircleNum(grid);
		System.out.println(b);
	}
	public static int findCircleNum(int[][] M) {
	       int[] visited=new int[M.length];
	       int count=0;
	       for(int i=0;i<M.length;i++){
	           if(visited[i]==0){
	               
	               dfs(M,visited,i);
	               count++;
	           }
	       }
	       return count;
	    }
	    public static void dfs(int[][] M, int[] visited, int i){
	        System.out.println("down "+i);
	        visited[i]=1;
	            for(int k=0;k<visited.length;k++){
	                if(visited[k]!=1 && M[i][k]==1){
	                    dfs(M,visited,k);
	                }
	            }
	        
	    }
}
