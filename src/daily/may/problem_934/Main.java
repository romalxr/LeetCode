package daily.may.problem_934;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = { { 0,1,0 }, { 0,0,0 }, { 0,0,1 } };
        System.out.println(solution.shortestBridge(grid));
        grid = new int[][] { { 1,1,1,1,1 }, { 1,0,0,0,1 }, { 1,0,1,0,1 }, { 1,0,0,0,1 }, { 1,1,1,1,1 } };
        System.out.println(solution.shortestBridge(grid));
    }
}
