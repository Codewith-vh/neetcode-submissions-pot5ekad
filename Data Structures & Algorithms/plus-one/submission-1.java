class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length, ind=0, rem=0;
        if(digits.length==1 && digits[0]==9){
            int ans[]=new int[2];
            ans[0]=1;
            ans[1]=0;
            return ans;

        }
        if(digits[0]==9 && digits[1]==9){
            n+=1;
            rem=1;
        }
        int out[]=new int[n];
        for(int i=n-1-rem;i>=0;i--){
            if(digits[i]+1<=9){
                out[i]=digits[i]+1;
                ind=i;
                break;
            }
            else{
                if(i==0){
                    out[i]=out[i]+out[i+1];
                }
                else{
                    out[i]=0;
                    out[i-1]=1;
                }
            }
        }
        
        for(int i=0;i<ind;i++){
            out[i]=digits[i];
        }
        // System.out.println(out[n-1]);
        // if(out[n-1]==0 && n==digits.length){
        //     System.out.println("hy");
        //     for(int i=ind;i<n;i++){
        //     digits[i]=out[i];
        // }
        // return digits;
        // }
        return out;
    }
}
