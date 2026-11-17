class Solution {
    public int robber(int cost[], int i, int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int include=cost[i]+robber(cost,i+2,dp);
        int exclude=robber(cost,i+1,dp);
        dp[i]=Math.max(include,exclude);
        return Math.max(include,exclude);
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int ans1= robber(Arrays.copyOfRange(nums,0,nums.length-1),0,dp);
        Arrays.fill(dp,-1);
        int ans2=robber(Arrays.copyOfRange(nums,1,nums.length),0,dp);
        return Math.max(ans1,ans2);
    }
}
