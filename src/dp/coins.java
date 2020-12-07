package dp;

public class coins {
	
	/***
	 * 求出硬币兑换的情况数目
	 * @param n
	 * @return
	 */
	public int wasToChangCoins(int n) {
		
		int []count = new int[n+1];
		
		for (int i =0;i<n+1;i++){
			
			count[i] = 1;	
		}
		int []coins = {5,10,25};
		
		for (int coin:coins) {
			
			for (int i = coin;i<=n;i++){
				
				count[i] = count[i] + count[i-coin];
			}
		}
		
		return count[n];
	}

    public int waysToChange(int n) {
    	
        int[] dp = new int[n + 1];
        
        int[] coins = new int[]{1,5,10,25};
        
        dp[0] = 1;
        
        for(int coin : coins) {
        	
            for(int i = coin; i <= n; i++) {
            	
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        } 
        
        return dp[n];
    }
    
	public static void main(String[] args) {
		
		coins coinA=new coins();
		
	    int count = coinA.wasToChangCoins(1090); 
	    
	    int countB = coinA.waysToChange(1090);
	    
	    System.out.println(count+","+countB);
				
	}

}
