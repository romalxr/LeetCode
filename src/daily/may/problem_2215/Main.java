package daily.may.problem_2215;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {-80,-15,-81,-28,-61,63,14,-45,-35,-10};
        int[] nums2 = {-1,-40,-44,41,10,-43,69,10,2};
        var result = solution.findDifference(nums1, nums2);
        System.out.println(result);
    }
}
