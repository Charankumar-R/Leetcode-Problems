class Solution {
    public int minHealthNeededToReachDest(int i, int j, int n, int m, int[][] mat, int[][] dp){
        if(i==n || j==m) return dp[i][j] = (int) 1e9;
        if(i==n-1 && j==m-1) return dp[i][j] = (mat[i][j] < 0) ? 1 - mat[i][j] : 1;
        if(dp[i][j] != 0) return dp[i][j];
        int right = minHealthNeededToReachDest(i+1, j, n, m, mat, dp);
        int down = minHealthNeededToReachDest(i, j+1, n, m, mat, dp);
        int minHealthReq = Math.min(right, down) - mat[i][j];
        return dp[i][j] = (minHealthReq <= 0) ? 1 : minHealthReq;
    } 

    public int calculateMinimumHP(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] dp = new int[n+1][m+1];
        return minHealthNeededToReachDest(0, 0, n, m, mat, dp);
    }
}