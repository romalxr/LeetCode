package daily.july.problem_1751;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] events = { { 1,2,4 },{ 3,4,3 },{ 2,3,10 } };
        int k = 3;
        System.out.println(solution.maxValue(events, k));
    }
}
