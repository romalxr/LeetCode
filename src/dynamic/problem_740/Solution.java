package dynamic.problem_740;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxValue = 0;
        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }

        int[] dp = new int[maxValue + 1];
        for (int num : nums) {
            dp[num] += num;
        }

        dp[1] = Math.max(dp[0], dp[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + dp[i]);
        }

        return dp[maxValue];
    }
}
