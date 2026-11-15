class Solution {
    public boolean power(int n, int i){
        if(i==n){
            return true;
        }
        else if(i<n){
           return power(n,i*2);
        }
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return power(n/2,1);
    }
}