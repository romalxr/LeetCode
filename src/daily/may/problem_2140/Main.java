package daily.may.problem_2140;

public class Main {
    public static void main(String[] args) {
        int[][] nums;
        Solution solution = new Solution();
        nums = new int[][] { {3,2}, {4,3}, {4,4}, {2,5} };
        System.out.println(solution.mostPoints(nums));
        nums = new int[][] { {1,1}, {2,2}, {3,3}, {4,4}, {5,5} };
        System.out.println(solution.mostPoints(nums));
        nums = new int[][] { {21,5},{92,3},{74,2},{39,4},{58,2},{5,5},{49,4},{65,3} };
        System.out.println(solution.mostPoints(nums));
    }
}
