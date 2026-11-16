class Solution {
    public int robber(int i, int[] nums, int[] dp){
        int n=nums.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int curr=nums[i]+robber(i+2,nums,dp);
        int skip=robber(i+1,nums,dp);
               
        dp[i]=Math.max(curr,skip);
        return Math.max(curr,skip);
    }
    public int rob(int[] nums) {
        int[] arr= new int[nums.length+1];
        Arrays.fill(arr,-1);
        return robber(0,nums,arr);
    }
}
