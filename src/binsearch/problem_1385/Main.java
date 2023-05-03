package binsearch.problem_1385;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,5,8};
        int[] nums2 = {10,9,1,8};
        int d = 2;
        int result = new Solution().findTheDistanceValue(nums1, nums2, d);
        System.out.println(result);
    }
}
