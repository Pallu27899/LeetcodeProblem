class Solution {
    
    private int n, m;
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++)
                if (grid[i][j] > 0) ans = Math.max(ans, connected(i, j, grid));
        return ans;
    }
    private int connected(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] < 1) return 0;
        grid[i][j] = 0;
        return 1 + connected(i-1, j, grid) + connected(i, j-1, grid) + connected(i+1, j, grid) + connected(i, j+1, grid);
    }
}