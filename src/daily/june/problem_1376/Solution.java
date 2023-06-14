package daily.june.problem_1376;

import java.util.*;

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < manager.length; i++) {
            if (i == headID) continue;
            graph[manager[i]].add(i);
        }

        int[] max = {0};
        dfsFindMax(graph, max, headID, 0, informTime);
        return max[0];
    }

    private void dfsFindMax(List<Integer>[] graph, int[] max, int index, int value, int[] informTime) {
        value += informTime[index];
        max[0] = Math.max(max[0], value);
        for (Integer i : graph[index]) {
            dfsFindMax(graph, max, i, value, informTime);
        }
    }
}
