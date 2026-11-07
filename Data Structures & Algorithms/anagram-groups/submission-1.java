class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm= new HashMap<String,ArrayList<String>>();
        ArrayList<List<String>> arr= new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            // int sum=0;
            int count[]=new int[26];
            for(int j=0;j<strs[i].length();j++){
                // sum+=strs[i].charAt(j);
                count[strs[i].charAt(j) - 'a']++;
            }
            String sum= Arrays.toString(count);
            if(!hm.containsKey(sum)){
                ArrayList<String> sub= new ArrayList<String>();
                sub.add(strs[i]);
                hm.put(sum,sub);
            }
            else{
                hm.get(sum).add(strs[i]);
            }
        }
        hm.forEach((key, value) -> {
            arr.add(value);
        });
        return arr;
    }
}
