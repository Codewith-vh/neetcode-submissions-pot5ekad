class Solution {
    public void reverseString(char[] s) {
        char[] s1= new char[s.length];
        for(int i=0;i<s.length;i++){
            s1[i]=s[i];
        }
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            s[i]=s1[j];
            j++;
        }
    }
}