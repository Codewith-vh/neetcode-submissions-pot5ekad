class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();

    public void recur(int[] nums, int k, ArrayList<Integer> sub, int start){
        if(sub.size()==k){
            arr.add(new ArrayList<Integer>(sub));
            return;
        }
        else if(sub.size()>k){
            return;
        }
        for(int i=start;i<nums.length;i++){
            sub.add(nums[i]);
            recur(nums,k,sub,i+1);
            sub.remove(sub.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        recur(nums,k, new ArrayList<Integer>(), 0);
        return arr;
    }
}