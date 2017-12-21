
public class puzzle {
public static void main(String args[]){
	int[][] grid={};
	String a="NEWNNSEEENNNENWNEESNNEWSENEESWNNSNENSNWWWSSSEWSSWSESWWNEWWWNENWNNNEWENSNSSNEEEEEWSEWEEWNSNNSNWWESWW";
	
	
	for(int i=0;i<grid.length;i++){
		for(int j=0;j<grid[0].length;j++){
			int subrow=i;
			int subcol=j;
			for(int k=0;k<a.length();k++){
				
				if(a.charAt(k)=='N'){
					if(subrow-1<0){
							continue;
						}
					if(grid[subrow-1][subcol]!=1){
						continue;
					}
					}
				}
			}
		}
	}
}
}
