class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] c = new int[m + 2];
        c[0] = 0; c[m + 1] = n;
        System.arraycopy(cuts, 0, c, 1, m);
        Arrays.sort(c);

        int[][] dp = new int[m + 2][m + 2];

        for (int len = 2; len < m + 2; len++) {
            for (int i = 0; i + len < m + 2; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], c[j] - c[i] + dp[i][k] + dp[k][j]);
                }
                if (dp[i][j] == Integer.MAX_VALUE) dp[i][j] = 0;
            }
        }
        return dp[0][m + 1];
    }
}
