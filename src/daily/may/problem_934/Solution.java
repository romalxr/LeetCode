package daily.may.problem_934;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int n;
    int[] dx = { -1, +1, +0, +0 };
    int[] dy = { +0, +0, -1, +1 };

    public int shortestBridge(int[][] grid) {
        boolean found = false;
        n = grid.length;

        Queue<int[]> queue = new LinkedList<>();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (grid[x][y] == 1) {
                    if (!found) {
                        found = true;
                        dfs(grid, x, y);
                    } else {
                        queue.add(new int[] { x, y });
                    }
                }
            }
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int c = 0; c < size; c++) {
                int[] b = queue.remove();
                int x = b[0];
                int y = b[1];
                for (int i = 0; i < dx.length; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if (grid[nx][ny] == 2) {
                        return ans;
                    }
                    if (grid[nx][ny] == 0) {
                        grid[nx][ny] = 1;
                        queue.add(new int[] { nx, ny });
                    }
                }
            }
            ans++;
        }
        return 0;
    }

    public void dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) return;
        if (grid[x][y] != 1) return;
        grid[x][y] = 2;
        for (int i = 0; i < dx.length; i++) {
            dfs(grid, x + dx[i], y + dy[i]);
        }
    }
}
