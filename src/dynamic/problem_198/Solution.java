package dynamic.problem_198;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int now = Math.max(nums[0], nums[1]);
        int prev = nums[0];
        for (int i = 2; i < n; i++) {
            int calc = Math.max(now, nums[i] + prev);
            prev = now;
            now = calc;
        }
        return now;
    }
}
