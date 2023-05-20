package daily.may.problem_785;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] graph1 = { {1,2,3}, {0,2}, {0,1,3}, {0,2} };
        System.out.println(solution.isBipartite(graph1));
        int[][] graph2 = { {1,3}, {0,2}, {1,3}, {0,2} };
        System.out.println(solution.isBipartite(graph2));
    }
}
