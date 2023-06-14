package daily.june.problem_547;

class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            dfs_checkVisited(isConnected, i, visited);
            sum++;
        }
        return sum;
    }

    private void dfs_checkVisited(int[][] graph, int i, boolean[] visited) {
        for (int j = 0; j < graph[i].length; j++) {
            if (visited[j]) continue;
            if (j == i) continue;
            if (graph[i][j] == 0) continue;
            visited[j] = true;
            dfs_checkVisited(graph, j, visited);
        }
    }
}
