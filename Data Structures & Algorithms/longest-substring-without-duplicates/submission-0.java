class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sum=1, i=0, j=i+1, max=1;
        StringBuilder str= new StringBuilder("");
        if(s.equals("")){
            return 0;
        }
        HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
        str.append(s.charAt(i));
        hm.put(s.charAt(i),1);
        while(j<s.length()){
            if(!hm.containsKey(s.charAt(j))){
            str.append(s.charAt(j));
                hm.put(s.charAt(j),1);
                sum+=1;
            }
            else{
                int ind=str.indexOf(""+s.charAt(j));
                if(ind>=0){
                    str.delete(0,ind+1);
                    sum-=ind+1;
                }

                    str.append(s.charAt(j));
                    hm.put(s.charAt(j),1);
                    sum+=1;

            }
            if(max<sum){
                max=sum;
            }
            j++;
        }
        return max;
    }
}
