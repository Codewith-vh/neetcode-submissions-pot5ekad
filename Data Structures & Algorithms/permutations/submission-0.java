class Solution {
    ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
    public void permu(int[] nums, int j) {
        if (j >= nums.length) {
            ArrayList<Integer> sub = new ArrayList<Integer>();
            for (int k = 0; k < nums.length; k++) {
                sub.add(nums[k]);
            }
            arr.add(new ArrayList<Integer>(sub));

            return;
        }
        for (int i = j; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            permu(nums, j + 1);
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        permu(nums, 0);
        return arr;
    }
}
