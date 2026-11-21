class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
    HashMap<ArrayList<Integer>,Integer> hm= new HashMap<ArrayList<Integer>, Integer>();
    public void perm(int nums[], int target, int start, ArrayList<Integer> sub){
        if(target<0){
            return;
        }
        else if(target==0){
            Collections.sort(sub);

            if(hm.containsKey(sub)){
                return;
            }
            hm.put(new ArrayList<Integer>(sub),1);
            arr.add(new ArrayList<Integer>(sub));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target){
                break;
            }
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            if(target-nums[i]>=0){
                sub.add(nums[i]);
                perm(nums, target-nums[i], i+1,sub);
                sub.remove(sub.size()-1);
            }
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        perm(candidates, target,0, new ArrayList<Integer>());
        return arr;
    }
}
