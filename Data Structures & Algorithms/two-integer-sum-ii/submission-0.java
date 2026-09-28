class Solution {
    public int[] twoSum(int[] arr, int k) {
        int numbers[]=new int[2];
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                numbers[0]=i+1;
                numbers[1]=j+1;
                return numbers;
            }
            else if(arr[i]+arr[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
        return numbers;
    }
}
