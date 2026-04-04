class Solution {
    public ArrayList<List<Integer>> subset(int[] nums, int i, ArrayList<List<Integer>> arr, ArrayList<Integer> small, int j){
        if(i>=nums.length){
        System.out.println(small);

            arr.add(new ArrayList<>(small));
            j++;
            return arr;
        }
        small.add(nums[i]);
        arr=subset(nums,i+1,arr,small,j);
        small.remove(small.size()-1);
        arr=subset(nums,i+1,arr,small,j);
        return arr;
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
        ArrayList<Integer> small= new ArrayList<Integer>();
        subset(nums, 0, arr, small,0);
        return arr;
    }
}
