class Solution {
    public void combo(int[] nums, int i, List<List<Integer>> arr, List<Integer> small,int target, int sum){
        if(sum>target || i>=nums.length){
            return;
        }
        else if(sum==target){
            arr.add(new ArrayList<>(small));
            return;
        }
        small.add(nums[i]);
        sum+=nums[i];
        combo(nums,i,arr,small, target, sum);
        sum-=small.get(small.size()-1);
        small.remove(small.size()-1);
        combo(nums,i+1,arr,small, target, sum);
        return;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        combo(nums, 0, arr, small, target, 0);
        return arr;
    }
}
