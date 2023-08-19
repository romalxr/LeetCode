package daily.august.problem_542;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];

        for (int[] l : ans) {
            Arrays.fill(l, -1);
        }

        Queue<Integer[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                    queue.add(new Integer[] { i, j });
                }
            }
        }

        int[][] p = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
        while (!queue.isEmpty()) {
            Integer[] ij = queue.poll();
            int i = ij[0];
            int j = ij[1];
            for (int[] path : p) {
                int di = path[0];
                int dj = path[1];
                int ni = i + di;
                int nj = j + dj;
                if (ni < 0 || nj < 0) continue;
                if (ni >= n || nj >= m) continue;
                if (ans[ni][nj] != -1) continue;

                ans[ni][nj] = ans[i][j] + 1;
                queue.add(new Integer[] { ni, nj });
            }
        }

        return ans;
    }
}
