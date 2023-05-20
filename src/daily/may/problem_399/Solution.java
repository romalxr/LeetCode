package daily.may.problem_399;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        int nextInd = 0;
        Map<String, Integer> map = new HashMap<>();
        double[][] table = new double[20][20];

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);

            Integer s1i = map.get(equation.get(0));
            Integer s2i = map.get(equation.get(1));
            if (s1i == null) {
                s1i = nextInd;
                map.put(equation.get(0), nextInd++);
            }
            if (s2i == null) {
                s2i = nextInd;
                map.put(equation.get(1), nextInd++);
            }

            table[s1i][s2i] = values[i];
            table[s2i][s1i] = 1.0 / values[i];
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);

            Integer s1i = map.get(query.get(0));
            Integer s2i = map.get(query.get(1));
            if (s1i == null || s2i == null) {
                result[i] = -1;
                continue;
            }
            result[i] = table[s1i][s2i];
            if (result[i] == 0) {
                boolean[] vis = new boolean[20];
                result[i] = dfs(s1i, s2i, table, vis);
            }
        }

        return result;
    }

    public double dfs(int node, int dest, double[][] table, boolean[] vis) {
        vis[node] = true;
        if (node == dest) return 1.0;
        if (table[node][dest] != 0) return table[node][dest];

        for (int j = 0; j < table[node].length; j++) {
            if (table[node][j] == 0) continue;
            if (vis[j]) continue;
            double ans = table[node][j] * dfs(j, dest, table, vis);
            if (ans > 0) {
                table[node][dest] = ans;
                table[dest][node] = 1.0 / ans;
                return ans;
            }
        }
        return -1.0;
    }
}
