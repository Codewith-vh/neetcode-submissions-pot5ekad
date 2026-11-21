class Solution {
    int count=0;
    public boolean isSafe(char maze[][], int row, int col) {
        for (int i = col; i >= 0; i--) {
            if (maze[row][i]=='Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (maze[i][j]=='Q') {
                return false;
            }
        }
        for (int i = row, j = col; i < maze.length && j >= 0; i++, j--) {
            if (maze[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public void solve(char[][] maze, int j){
        if(j>=maze.length){
            count+=1;
            return;
        }
        for(int i=0;i<maze.length;i++){
            if(isSafe(maze,i,j)){
                maze[i][j]='Q';
                solve(maze,j+1);
                maze[i][j]='.';
            }
        }
    }

    public int totalNQueens(int n) {
        char maze[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(maze[i],'.');
        }
        solve(maze,0);
        return count;
    }
}