class Solution {

    public int robber(int i, int nums[], int dp[]){
        int n=nums.length;
        dp[n]=0;
        for(int j=n-1;j>=0;j--){
            int temp=0;
            if(j+2<=n){
                temp=dp[j+2];
            }
            int curr=nums[j]+temp;
            int skip=dp[j+1];
            dp[j]=Math.max(curr,skip);
        }
        return dp[0];
    }
    public int rob(int[] nums) {
        int[] arr= new int[nums.length+1];
        Arrays.fill(arr,-1);
        return robber(0,nums,arr);
    }
}
