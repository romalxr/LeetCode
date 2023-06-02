package daily.june.problem_2101;

import java.util.*;

class Solution {

    public int maximumDetonation(int[][] bombs) {

        int n = bombs.length;
        List<Integer>[] map = new List[n];
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (interects(bombs, i, j)) {
                    list.add(j);
                }
            }
            map[i] = list;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, bfs(map, i));
            if (max == n) return max;
        }
        return max;
    }

    private int bfs(List<Integer>[] map, int first)
    {
        boolean visited[] = new boolean[map.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[first] = true;
        int count = 1;

        queue.add(first);
        while (queue.size() != 0) {
            int i = queue.poll();
            List<Integer> nei = map[i];
            for (Integer j : nei) {
                if (!visited[j]) {
                    visited[j] = true;
                    count++;
                    queue.add(j);
                }
            }
        }
        return count;
    }

    private boolean interects(int[][] bombs, int i, int j) {
        if (i == j) return false;

//        Let there be point 1 with coordinates (X1, Y1) and point 2 with coordinates (X2, Y2)
//        Then the distance between them will be:
//        dist := sqrt( sqr(X1 - X2) + sqr(Y1 - Y2) );

        double distSqr =
                Math.pow(bombs[i][0] - bombs[j][0], 2) +
                Math.pow(bombs[i][1] - bombs[j][1], 2);

        return distSqr <= Math.pow(bombs[i][2], 2);
    }
}
