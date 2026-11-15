class Solution {
    int arr=-1;
    int j=0;
    public void Grammar(int curr, int prev, int i, int n, int k){
        if(i==n-1){
            j=j+1;
            if(j==k){
                arr=curr;
            }
            return ;
        }
        if(arr>-1){
            return;
        }
        if(curr==0){
            Grammar(0,0,i+1,n,k);
            Grammar(1,0,i+1,n,k);
        }
        else if(curr==1){
            Grammar(1,1,i+1,n,k);
            Grammar(0,1,i+1,n,k);
        }

    }
    public int kthGrammar(int n, int k) {
        
        if(n==1 || k==1){
            return 0;
        }
        int a= (int)(Math.pow(2,n-1)/2);
        if(a<k){
            Grammar(0,0,0,n,k-a);
            if(arr==1){
                return 0;
            }
            else{
                return 1;
            }
        }
        Grammar(0,0,0,n,k);
        return arr;
    }
}
