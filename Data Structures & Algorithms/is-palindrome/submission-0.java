class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='0' && s.charAt(i)<='9' ) ){
                if(s.charAt(j)>='a' && s.charAt(j)<='z' || s.charAt(j)>='0' && s.charAt(j)<='9'){
                if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
                }
                else{
                        j--;
                        continue;
                    }
            }
            else{
                i++;
            }
            
        }
        return true;
    }
}
