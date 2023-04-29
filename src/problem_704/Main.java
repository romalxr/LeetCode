package problem_704;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 13;
        int result = solution.search(nums, target);
        System.out.println(result);
    }
}
