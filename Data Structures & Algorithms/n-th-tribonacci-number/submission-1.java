class Solution {
    public int recur(int n, int[] dp){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans= recur(n-1,dp)+recur(n-2,dp)+recur(n-3,dp);
        dp[n]=ans;
        return ans;
    }
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }
}