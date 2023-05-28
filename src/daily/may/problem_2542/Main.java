package daily.may.problem_2542;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = { 2,1,14,12 };
        int[] nums2 = { 11,7,13,6 }; //168
        int k = 3;
        System.out.println(solution.maxScore(nums1, nums2, k));

    }
}
