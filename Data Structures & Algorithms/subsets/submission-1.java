class Solution {
    public ArrayList<List<Integer>> subset(int[] nums, int i, ArrayList<List<Integer>> arr, ArrayList<Integer> small){
        if(i>=nums.length){
            arr.add(new ArrayList<>(small));
            return arr;
        }
        small.add(nums[i]);
        arr=subset(nums,i+1,arr,small);
        small.remove(small.size()-1);
        arr=subset(nums,i+1,arr,small);
        return arr;
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
        ArrayList<Integer> small= new ArrayList<Integer>();
        subset(nums, 0, arr, small);
        return arr;
    }
}
