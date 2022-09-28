class Solution {
    public int numIslands(char[][] grid) {
      
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int p = grid.length, n = grid[0].length;
        int c = 0;
        for (int i = 0; i < p ; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1') {
                    c ++;
                    check(grid, p, n, i, j);
                }
            }
        }
        return c;
    }
    private void check(char[][] grid, int p, int n, int i, int j) {
        if (i < 0 || i >= p || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'X';
        check(grid, p, n, i - 1, j);
        check(grid, p, n, i + 1, j);
        check(grid, p, n, i, j - 1);
        check(grid, p, n, i, j + 1);
    }
}