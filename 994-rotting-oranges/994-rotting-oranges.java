class Solution {
   public int orangesRotting(int[][] grid) {
        int N = grid.length, M = grid[0].length;
        Queue<int[]> p = new LinkedList<>();
       int NewCou = 0;

       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               if (grid[i][j] == 1) {
                   NewCou++;
               } else if (grid[i][j] == 2) {
                   p.offer(new int[]{i, j});
               }
           }
       }

       int[][] arr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
       int step = 0;
       while (!p.isEmpty() && NewCou > 0) {
           int size = p.size();

           for (int i = 0; i < size; i++) {
               int[] curr = p.poll();
               for (int[] dir : arr) {
                   int X = curr[0] + dir[0];
                   int Y = curr[1] + dir[1];
                   if (X < 0 || X >= N || Y < 0 || Y >= M || grid[X][Y] != 1) {
                       continue;
                   }
                   p.offer(new int[]{X, Y});
                   grid[X][Y] = 2;
                   NewCou--;
               }
           }

           step++;
       }

       return NewCou == 0 ? step : -1;
   }
}