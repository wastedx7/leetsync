class Solution {
    public int totalNQueens(int n) {
        int[] ans = new int[1];
        boolean[][] board = new boolean[n][n];
        boolean[] rows = new boolean[n];
        boolean[] dia1 = new boolean[2 * n - 1];
        boolean[] dia2 = new boolean[2 * n - 1];
        backtrack(0, n, ans, board, rows, dia1, dia2);
        return ans[0];
    }
    private void backtrack(int col, int n, int[] ans, boolean[][] board, boolean[] rows, boolean[] dia1, boolean[] dia2){
        if(col == n){
            ans[0] += 1;
        }
        for(int i=0; i<n; i++){
            if(!rows[i] && !dia1[i-col+n-1] && !dia2[i+col]){
                board[i][col] = true;
                rows[i] = true;
                dia1[i-col+n-1] = true;
                dia2[i+col] = true;

                backtrack(col+1, n, ans, board, rows, dia1, dia2);

                board[i][col] = false;
                rows[i] = false;
                dia1[i-col+n-1] = false;
                dia2[i+col] = false;
            }
        }
    }
}