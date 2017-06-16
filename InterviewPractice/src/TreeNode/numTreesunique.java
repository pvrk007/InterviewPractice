package TreeNode;

public class numTreesunique {
	public static void main(String[] args){
		int t=4;
		int l=numTrees(t);
		System.out.println(l);
		/*logic is number of left * number of right*/
	}
public static int numTrees(int n) {
	int[] t=new int[n+1];
	t[0]=1;
	t[1]=1;
	t[2]=2;
	for(int i=3;i<=n;i++){
		for(int j=0;j<i;j++){
		t[i]+=t[j]*t[i-j-1];
		}
	}
	return t[n];
        
    }
}
