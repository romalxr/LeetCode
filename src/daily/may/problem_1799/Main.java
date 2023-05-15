package daily.may.problem_1799;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;

        nums = new int[] { 1,2 };
        System.out.println(solution.maxScore(nums));

        nums = new int[] { 1,2,3,4,5,6 };
        System.out.println(solution.maxScore(nums));
    }
}
