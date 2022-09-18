class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> rows = new HashSet<Character>();
            Set<Character> columns = new HashSet<Character>();
            Set<Character> cube = new HashSet<Character>();
            for(int j = 0; j < 9; j++){
                // Check row
                if(board[i][j] != '.' && !rows.add(board[i][j])){
                    return false;
                }
                
                // Check column
                if(board[j][i] != '.' && !columns.add(board[j][i])){
                    return false;
                }
                
                // Check cube
                int rowIndex = 3 * (i / 3);     // row index of current cube
                int colIndex = 3 * (i % 3);     // col index of current cube
                if(board[rowIndex + j / 3][colIndex + j % 3] != '.' &&
                   !cube.add(board[rowIndex + j / 3][colIndex + j % 3])){
                       return false;
                }
            }
        }
        return true;
    }
    
}