class Solution {
  public int[][] updateMatrix(int[][] mat) {
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
      return mat;
    }
    int[][] ans = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    Queue<Integer> X = new LinkedList<Integer>();
    Queue<Integer> Y = new LinkedList<Integer>();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 0) {
          X.add(i);
          Y.add(j);
        } else {
          mat[i][j] = Integer.MAX_VALUE;
        }
      }
    }
    while (!X.isEmpty()) {
      int x = X.poll();
      int y = Y.poll();
      for (int i = 0; i < ans.length; i++) {
        int nx = x + ans[i][0];
        int ny = y + ans[i][1];
        if (nx >= 0 && nx < mat.length && ny >= 0 && ny < mat[0].length && mat[nx][ny] > mat[x][y] + 1) {
          mat[nx][ny] = mat[x][y] + 1;
          X.add(nx);
          Y.add(ny);
        }
      }
    }
    return mat;
  }

}