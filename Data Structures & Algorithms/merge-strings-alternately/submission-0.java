class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int n=0;
        if(word1.length()<word2.length()){
            n=word1.length();
        }
        else{
            n=word2.length();
        }
        for(int i=0;i<n;i++){
            s+=word1.charAt(i);
            s+=word2.charAt(i);
        }
        if(n==word1.length()){
            s+=word2.substring(n,word2.length());
        }
        else{
            s+=word1.substring(n,word1.length());

        }
        return s;
    }
}