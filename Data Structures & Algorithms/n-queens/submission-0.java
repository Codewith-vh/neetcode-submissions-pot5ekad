class Solution {
    ArrayList<List<String>> arr = new ArrayList<List<String>>();

    public boolean isSafe(String maze[][], int row, int col) {
        for (int i = col; i >= 0; i--) {
            if (maze[row][i].equals("Q")) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (maze[i][j].equals("Q")) {
                return false;
            }
        }
        for (int i = row, j = col; i < maze.length && j >= 0; i++, j--) {
            if (maze[i][j].equals("Q")) {
                return false;
            }
        }
        return true;
    }

    public void solve(String maze[][], int col) {

        if (col >= maze.length) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < maze.length; i++) {
                board.add(String.join("", maze[i]));
            }
            arr.add(board);
            return;
        }
        for (int row = 0; row < maze.length; row++) {
            if (isSafe(maze, row, col)) {
                maze[row][col] = "Q";
                solve(maze, col + 1);
                maze[row][col] = ".";
            }

        }
    }

    public List<List<String>> solveNQueens(int n) {
        String maze[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(maze[i], ".");
        }
        solve(maze, 0);
        return arr;
    }
}