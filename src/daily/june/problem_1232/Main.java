package daily.june.problem_1232;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] nums = { {0,0}, {0,5}, {5,0}, {1337,0}, {0,1337} };
        System.out.println(solution.checkStraightLine(nums));
    }
}
