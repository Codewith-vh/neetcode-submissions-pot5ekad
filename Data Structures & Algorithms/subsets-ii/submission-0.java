class Solution {
    ArrayList<List<Integer>> arr= new ArrayList<List<Integer>>();
    HashMap<ArrayList<Integer>, Integer> hm= new HashMap<ArrayList<Integer>, Integer>();
    public void recur(int[] nums, int i, ArrayList<Integer> sub){
        if(i>=nums.length){            
            if(hm.containsKey(sub)){
                return;
            }
            hm.put(new ArrayList<>(sub),1);
            arr.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        recur(nums,i+1,sub);
        sub.remove(sub.size()-1);
        recur(nums,i+1,sub);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        recur(nums,0,new ArrayList<Integer>());
        return arr;
        
    }
}
