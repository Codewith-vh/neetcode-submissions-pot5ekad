class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
    public void recur(int[] nums, int j, ArrayList<Integer> sub){
        if(j>=nums.length){
            arr.add(new ArrayList<>(sub));
            return;
        }

            sub.add(nums[j]);
            recur(nums,j+1,sub);
            sub.remove(sub.size()-1);
            recur(nums,j+1,sub);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        recur(nums,0,new ArrayList<Integer>());
        return arr;
    }
}
