public class TrieNode{
        char data;
        HashMap<Character, TrieNode> children;
        boolean isTerminal;

        TrieNode(char val){
            data=val;
            children = new HashMap<>();
            isTerminal=false;
        }
    }

class PrefixTree {

    private TrieNode root;
    public PrefixTree() {
        root= new TrieNode('-');
    }

    public void insert(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
;            if(temp.children.containsKey(a)){
                temp=temp.children.get(a);
            }
            else{
                temp.children.put(a, new TrieNode(a));
                temp=temp.children.get(a);
            }
        }
        temp.isTerminal=true;

    }
    
    public boolean search(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            if(!temp.children.containsKey(a)){
                return false;
            }
            temp=temp.children.get(a);
        }
        if(temp.isTerminal==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean startsWith(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            if(!temp.children.containsKey(a)){
                return false;
            }
            temp=temp.children.get(a);
        }
        return true;
    }
}
