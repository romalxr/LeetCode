package daily.june.problem_2328;

import java.util.Arrays;

class Solution {
    static int mod = (int) 1e9 + 7;

    int dfs(int[][] grid, int[][] dp, int n, int m, int r, int c) {
        if (dp[r][c] != -1) return dp[r][c];
        long ans = 1;

        if (r - 1 >= 0 && grid[r - 1][c] > grid[r][c]) {
            ans += dfs(grid, dp, n, m, r - 1, c);
        }
        if (r + 1 < m && grid[r + 1][c] > grid[r][c]) {
            ans += dfs(grid, dp, n, m, r + 1, c);
        }
        if (c - 1 >= 0 && grid[r][c - 1] > grid[r][c]) {
            ans += dfs(grid, dp, n, m, r, c - 1);
        }
        if (c + 1 < n && grid[r][c + 1] > grid[r][c]) {
            ans += dfs(grid, dp, n, m, r, c + 1);
        }

        ans = ans % mod;
        return dp[r][c] = (int) ans;
    }

    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1) dfs(grid, dp, n, m, i, j);
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        return ans;
    }
}
