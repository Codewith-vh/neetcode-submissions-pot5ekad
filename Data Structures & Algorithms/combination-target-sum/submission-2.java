class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
    public void perm(int[] nums, int target, ArrayList<Integer> sub, int start){
        if(target==0){
            arr.add(new ArrayList<Integer>(sub));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            sub.add(nums[i]);
            perm(nums,target-nums[i],sub,i);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        perm(nums,target, new ArrayList<Integer>(), 0);
        return arr;
    }
}
