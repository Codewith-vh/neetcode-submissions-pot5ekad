class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
    HashMap<ArrayList<Integer>,Integer> hm= new HashMap<ArrayList<Integer>,Integer>();
    public void perm(int[] nums, int target, int i, int sum, ArrayList<Integer> sub){
        if(i>=nums.length){
            return;
        }
        if(target<sum){
            return;
        }
        if(target==sum){
            if(hm.containsKey(sub)){
                return;
            }
            hm.put(sub,1);
            arr.add(new ArrayList<Integer>(sub));
        }

        int ans=nums[i];
        sub.add(nums[i]);
        perm(nums,target,i,sum+ans,sub);
        sub.remove(sub.size()-1);
        perm(nums,target,i+1,sum,sub);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        perm(nums,target,0,0,new ArrayList<Integer> ());
        return arr;
    }
}
