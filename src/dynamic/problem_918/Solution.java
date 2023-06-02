package dynamic.problem_918;

class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        int min = Integer.MAX_VALUE;
        int minSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
            maxSum += num;
            max = Math.max(max, maxSum);
            if (maxSum < 0) maxSum = 0;
            minSum += num;
            min = Math.min(min, minSum);
            if (minSum > 0) minSum = 0;
        }

        if (sum == min) return max;
        return Math.max(max, sum - min);
    }
}
