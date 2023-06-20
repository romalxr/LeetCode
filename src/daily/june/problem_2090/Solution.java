package daily.june.problem_2090;

import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int l = k + k + 1;

        int first = 0;
        long sum = 0;
        for (int i = 0; i < l - 1 && i < n; i++) {
            sum += nums[i];
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = l - 1; i < n; i++) {
            sum += nums[i];
            sum -= first;
            first = nums[i - (l - 1)];
            ans[i - k] = (int) (sum / l);
        }
        return ans;
    }
}
