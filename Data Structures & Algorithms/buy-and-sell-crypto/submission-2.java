class Solution {
    public int maxProfit(int[] prices) {
        int min=0, max=prices[prices.length-1], ind=0;
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]>max){
                max=prices[i];
            }
            else if(prices[i]<max){
                if(min<max-prices[i]){
                    min=max-prices[i];
                }
            }
        }
        return min;
    }
}
