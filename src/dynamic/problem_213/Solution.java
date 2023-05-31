package dynamic.problem_213;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int sum1 = findInRange(nums, 0, n - 1);
        int sum2 = findInRange(nums, 1, n);

        return Math.max(sum1, sum2);
    }

    private static int findInRange(int[] nums, int l, int r) {
        int now = Math.max(nums[l], nums[l + 1]);
        int prev = nums[l];
        for (int i = l + 2; i < r; i++) {
            int calc = Math.max(now, nums[i] + prev);
            prev = now;
            now = calc;
        }
        return now;
    }
}
