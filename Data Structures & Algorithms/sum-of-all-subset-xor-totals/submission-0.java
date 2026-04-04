class Solution {
    public int xorsum(ArrayList<Integer> arr){
        if(arr.size()==1){
            return arr.get(0);
        }
        if(arr.size()==0){
            return 0;
        }
        int ans=0;
        for(int i=0;i<arr.size();i++){
            ans^=arr.get(i);
        }
        return ans;
    }
    public int subset(int[] nums, ArrayList<Integer> arr, int i, int sum){
        if(i>=nums.length){
            return xorsum(arr);
        }

        arr.add(nums[i]);
        int pick = subset(nums,arr,i+1,sum);
        arr.remove(arr.size() - 1);
        int skip = subset(nums,arr,i+1,sum);
        
        return pick + skip;
    }
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        return subset(nums, arr, 0, 0);
    }
}