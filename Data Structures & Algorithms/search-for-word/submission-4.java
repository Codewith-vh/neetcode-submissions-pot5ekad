class Solution {
    boolean flag=false;
    public void recur(char[][] board, int i, int j, String word, int k, int visited[][]){
        int n=board.length,m=board[i].length;
        if(i>=board.length || j>= board[i].length){
            flag=false;
            return;
        }
        if(k==word.length()){
            flag=true;
            return;
        }
        if(j+1<m && board[i][j+1]==word.charAt(k)&& visited[i][j+1]!=1){System.out.println("R");
            visited[i][j+1]=1;
            recur(board,i,j+1,word,k+1,visited);
            visited[i][j+1]=0;
        }
        if(i+1<n && board[i+1][j]==word.charAt(k)&& visited[i+1][j]!=1){System.out.println("D");
        visited[i+1][j]=1;
            recur(board,i+1,j,word,k+1,visited);
            visited[i+1][j]=0;
        }
        if(j-1>=0 && board[i][j-1]==word.charAt(k)&& visited[i][j-1]!=1){System.out.println("L");
        visited[i][j-1]=1;
            recur(board,i,j-1,word,k+1,visited);
            visited[i][j-1]=0;
        }
        if(i-1>=0 && board[i-1][j]==word.charAt(k)&& visited[i-1][j]!=1){System.out.println("U");
        visited[i-1][j]=1;
            recur(board,i-1,j,word,k+1,visited);
            visited[i-1][j]=0;
        }
    }
    public boolean exist(char[][] board, String word) {
        int k=0;
        

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(k)){
                    int visited[][]=new int[board.length][board[0].length];
                    System.out.println(i+" "+j);
                    visited[i][j]=1;
                    recur(board,i,j,word,k+1,visited);
                    if(flag){
                        return true;
                    }
                    
                }
            }
        }
        System.out.println("hey");
        return false;
    }
}
