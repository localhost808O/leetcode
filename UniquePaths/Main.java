class Solution {


    public int uniquePaths(int x, int y) {
        int[][] dp = new int[x][y];
        dp[0][0] = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
               dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[x - 1][y - 1];
    }
}
