package daily.may.problem_2542;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        k--;
        int n = nums1.length;

        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i] = new int[] { nums1[i], nums2[i] };
        }
        Arrays.sort(nums, (a, b) -> b[1] - a[1]);

        long max = 0;
        long sum = 0;
        Queue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            heap.add(nums[i][0]);
            sum += nums[i][0];

            if (i > k) sum -= heap.remove();
            if (i >= k) max = Math.max(max, sum * nums[i][1]);
        }
        return max;
    }
}
