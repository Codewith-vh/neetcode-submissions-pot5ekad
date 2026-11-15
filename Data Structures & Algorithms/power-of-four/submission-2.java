class Solution {
    public boolean power(int n, int i){
        if(i==n){
            return true;
        }
        else if(i<n){
           return power(n,i*4);
        }
        return false;
    }
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        return power(n/4,1);
    }
}
