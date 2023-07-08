package daily.june.problem_956;

class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = 0;
        for (int rod : rods) {
            sum += rod;
        }
        sum++;
        int[] dp = new int[sum];
        for (int d = 1; d < sum; d++) dp[d] = -10000;
        //System.out.println(Arrays.toString(dp));
        for (int x : rods) {
            int[] cur = dp.clone();
            for (int d = 0; d + x < sum; d++) {
                dp[d + x] = Math.max(dp[d + x], cur[d]);
                int dx = Math.abs(d - x);
                int min_d_x = Math.min(d, x);
                dp[dx] = Math.max(dp[dx], cur[d] + min_d_x);
                //System.out.println(Arrays.toString(dp));
            }
        }
        return dp[0];
    }
}
