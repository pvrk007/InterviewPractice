
public class coinChange {
public static void main(String[] args){
	
	int s=6;
	int N=3;
	int[] a={1,2,3};
	
	int[][] c=new int[s+1][N+1];
//	for(int m=0;m<c.length;m++){
//		c[m]=1;
//	}
	for(int f=0;f<c[0].length;f++){
		c[0][f]=1;
	}
	
	for(int d=1;d<c.length;d++){
		c[d][N]=0;
	}
	for(int i=1;i<=s;i++){
		for(int j=N-1;j>=0;j--){
			for(int k=0;(k*a[j])<=i;k++){
				if(i-(k*a[j])>0)
				c[i][j]+=c[i-(k*a[j])][j+1];
			}
		}
	}
	for(int l=0;l<c.length;l++){
		for(int p=0;p<c[0].length;p++){
		System.out.print(" "+c[l][p]);
		}
		System.out.println("");
	}
}
}
