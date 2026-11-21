class Solution {
    ArrayList<List<String>> arr = new ArrayList<List<String>>();
    HashMap<Integer, Boolean> hor= new HashMap<> ();
    HashMap<Integer, Boolean> lowerLeft=new HashMap<> ();
    HashMap<Integer, Boolean> upperLeft= new HashMap<> ();
    
    public boolean isSafe(char maze[][], int row, int col) {
        if(hor.containsKey(row)&&hor.get(row)==true){
            return false;
        }
        if(upperLeft.containsKey(row-col) && upperLeft.get(row-col)==true){
            return false;
        }
        if(lowerLeft.containsKey(row+col)&&lowerLeft.get(row+col)==true){
            return false;
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
                hor.put(row,true);
                upperLeft.put(row-col,true);
                lowerLeft.put(row+col,true);
                maze[row][col] = 'Q';
                solve(maze, col + 1);
                maze[row][col] = '.';
                hor.put(row,false);
                upperLeft.put(row-col,false);
                lowerLeft.put(row+col,false);
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