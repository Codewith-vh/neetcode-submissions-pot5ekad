class Solution {

    public int recursion(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                int ans = recursion(coins, amount - coins[i],dp);
                if (ans != Integer.MAX_VALUE) {
                    mini = Math.min(mini, 1 + ans);
                }
            }

        }
        dp[amount]=mini;
        return mini;
    }

    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = recursion(coins, amount, dp);
        if (ans != Integer.MAX_VALUE) {
            return ans;
        }
        return -1;
    }
}