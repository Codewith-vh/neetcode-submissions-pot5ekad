class Solution {
    public int recur(int[] costs, int i, int[] dp){
        if(i>=costs.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans1=costs[i]+recur(costs,i+1,dp);
        int ans2=costs[i]+recur(costs,i+2,dp);
        dp[i]=Math.min(ans1,ans2);
        return Math.min(ans1,ans2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int ans1=recur(cost, 0,dp);
        int ans2=recur(cost,1,dp);
        return Math.min(ans1,ans2);
    }
}
