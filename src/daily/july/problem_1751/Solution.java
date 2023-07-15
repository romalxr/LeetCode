package daily.july.problem_1751;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    private static int[][] events;
    private static int[][] dp;
    public int maxValue(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int n = events.length;
        dp = new int[n + 1][k + 1];

        for (int index = n - 1; index >= 0; index--) {
            int nextIndex = binarySearch(events[index][1]);
            for (int j = 1; j <= k; j++) {
                dp[index][j] = Math.max(
                        dp[index + 1][j],
                        events[index][2] + dp[nextIndex][j - 1]
                );
            }
        }
        return dp[0][k];
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int maxValue2(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;

        dp = new int[n][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, k);
    }

    private int solve(int index, int count) {
        if (count == 0 || index == events.length) {
            return 0;
        }
        if (dp[index][count] != -1) {
            return dp[index][count];
        }
        int nextIndex = binarySearch(events[index][1]);
        dp[index][count] = Math.max(
                events[index][2] + solve(nextIndex, count - 1),
                solve(index + 1, count)
        );
        return dp[index][count];
    }
}
