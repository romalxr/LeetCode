package daily.july.problem_1751;

import java.util.Arrays;

public class Solution2 {
    private static int[][] events;
    private static int[][] dp;

    public int maxValue(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int n = events.length;
        dp = new int[n + 1][k + 1];

        for (int index = n - 1; index >= 0; index--) {
            int nextIndex = binarySearch(index + 1, events[index][1]);
            for (int j = 1; j <= k; j++) {
                dp[index][j] = Math.max(
                        dp[index + 1][j],
                        dp[nextIndex][j - 1] + events[index][2]
                );
            }
        }
        return dp[0][k];
    }

    private int binarySearch(int index, int target) {
        int left = index;
        int right = events.length;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (target >= events[mid][0]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
