class Solution {
    ArrayList<String> arr= new ArrayList<String>();
    public void recur(ArrayList<String> str, int i, int j, int k, ArrayList<Character>sub){
        
        if(sub.size()==k){
            String s= "";
            for(int m=0;m<sub.size();m++){
                s+=sub.get(m);
            }
            arr.add(s);
            return;
        }
        if(i>=str.size()){
            return;
        }
        
        for(int l=0;l<str.get(i).length();l++){
            if(str.get(i).charAt(l)=='0'){
                return;
            }
            sub.add(str.get(i).charAt(l));
            recur(str,i+1,j+1,k,sub);
            sub.remove(sub.size()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return arr;
        }
        HashMap<Integer, String>hm= new HashMap<Integer, String>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        ArrayList<String> str=new ArrayList<String>();
        for(int i=0;i<digits.length();i++){
            String st="";
            st=hm.get(digits.charAt(i)-'0');
            if(digits.charAt(i)-'0'!=7 && digits.charAt(i)-'0'!=9){
                st+="0";
            }
            str.add(st);
        }
        recur(str,0,0,digits.length(), new ArrayList<Character>());
        return arr;
    }
}