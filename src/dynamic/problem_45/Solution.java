package dynamic.problem_45;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];

        for(int i = n - 2; i >= 0; i--) {
            int min = 99999;
            for(int j = i + 1; j <= i + nums[i] && j < n; j++) {
                min = Math.min(min, dp[j] + 1);
            }
            dp[i] = min;
        }
        return dp[0];
    }
}
