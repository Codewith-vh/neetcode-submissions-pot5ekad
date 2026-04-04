class Solution {
    public int majorityElement(int[] res) {
        int nums[]=Arrays.copyOf(res,res.length);
        Arrays.sort(nums);
        int count=1;
        int max=0, ind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                if(count>(nums.length)/2 && max<count){
                    max=count;
                    ind=nums[i-1];
                    // System.out.println("hey"+ind);
                }
                // System.out.println("hi");
                count=1;
            }
            // System.out.println(nums[i]+" "+count);

        }
        if(count>(nums.length)/2 && max<count){
                    max=count;
                    ind=nums[nums.length-1];
                    System.out.println("hey"+ind);
                }
        return ind;
    }
}