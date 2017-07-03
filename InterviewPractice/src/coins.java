
public class coins {
public static void main(String [] args){
	int[] coins={5};
	int amount=10;
	int num=coinChange(coins,amount);
	System.out.println(num);
}

public static int coinChange(int[] coins, int amount) {
    int sum=1;
    int[] dp=new int[amount+1];
    while(sum<=amount){
    	int min=-1;
    	for(int i=0;i<coins.length;i++){
    		if(sum>=coins[i] && dp[sum-coins[i]]!=-1){
    			int temp=dp[sum-coins[i]]+1;
    			min=min<0?temp:(temp<min?temp:min);
    		}
    	}
    	dp[sum]=min;
    	sum++;
    }
    
    
    
    return dp[amount];
	
	
	
}

}
