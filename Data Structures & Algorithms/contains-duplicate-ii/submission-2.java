class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> hm= new HashMap<Integer, ArrayList<Integer>>();
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.get(nums[i]).add(i);
                continue;
            }
            hm.put(nums[i], new ArrayList<Integer>());
            hm.get(nums[i]).add(i);
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
            ArrayList<Integer> value = entry.getValue();

            if (value.size() > 1) {
                int j=0,l=1;
                while(l<value.size()){
                    if (value.get(l) - value.get(j) <= k) {
                        ans = true;
                        break;
                    }
                    j++;
                    l++;
            }
            }
        }
        return ans;
    }
}