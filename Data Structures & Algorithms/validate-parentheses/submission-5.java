class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1){
            return false;
        }
        LinkedList<String> ll= new LinkedList<String>();
        ArrayList<String> open = new ArrayList<String>();
        ArrayList<String> close = new ArrayList<String>();
        open.add("{");
        open.add("[");
        open.add("(");
        close.add("{}");
        close.add("[]");
        close.add("()");
        if(!open.contains(""+s.charAt(0))){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(open.contains(""+s.charAt(i))){
                ll.push(""+s.charAt(i));
            }
            else{
                if(ll.size()>0){
                    String str=ll.pop();
                    if(!close.contains(str+s.charAt(i))){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(ll.size()>0){
            return false;
        }
        return true;
    }
}
