package dynamic.problem_55;

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n && i <= max; i++) {
            max = Math.max(max, i + nums[i]);
        }
        return max >= n - 1;
    }
}
