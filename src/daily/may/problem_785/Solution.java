package daily.may.problem_785;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int mark = 1;
        int[] marks = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (marks[i] != 0) {
                continue;
            }
            marks[i] = mark;
            if (dfs(graph, mark, marks, i)) return false;
        }
        return true;
    }

    private static boolean dfs(int[][] graph, int mark, int[] marks, int i) {
        int nextMark = 3 - mark;
        int[] next = graph[i];
        for (int j : next) {
            if (marks[i] == marks[j]) {
                return true;
            }
            if (marks[j] != 0) {
                continue;
            }
            marks[j] = nextMark;
            if (dfs(graph, nextMark, marks, j)) return true;
        }
        return false;
    }
}

