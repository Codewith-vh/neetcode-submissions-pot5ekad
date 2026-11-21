class Solution {
    ArrayList<List<String>> arr = new ArrayList<List<String>>();

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

    public void solve(char maze[][], int col) {

        if (col >= maze.length) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < maze.length; i++) {
                board.add(new String(maze[i]));
            }
            arr.add(board);
            return;
        }
        for (int row = 0; row < maze.length; row++) {
            if (isSafe(maze, row, col)) {
                maze[row][col] = 'Q';
                solve(maze, col + 1);
                maze[row][col] = '.';
            }

        }
    }

    public List<List<String>> solveNQueens(int n) {
        char maze[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(maze[i], '.');
        }
        solve(maze, 0);
        return arr;
    }
}