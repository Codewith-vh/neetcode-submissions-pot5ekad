class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            int ch=' ';
            int a=s.charAt(i);
            if(a==ch){
                break;
            }
            else{
            count++;}
        }
        return count;
    }
}