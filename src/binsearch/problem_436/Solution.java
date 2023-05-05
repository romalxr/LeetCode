package binsearch.problem_436;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int[][] nums = new int[intervals.length][];
        for (int i = 0; i < intervals.length; i++) {
            nums[i] = new int[] {intervals[i][0], i};
        }
        Arrays.sort(nums, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];
            result[i] = searchNext(nums, end);
        }

        return result;
    }

    public int searchNext(int[][] nums, int target) {

        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid][0] < target) {
                low = mid + 1;
            } else if (nums[mid][0] > target) {
                high = mid - 1;
            } else if (nums[mid][0] == target) {
                index = mid;
                break;
            }
        }

        if (index != -1) {
            return nums[index][1];
        }
        if (low >= nums.length) {
            return -1;
        } else {
            return nums[low][1];
        }
    }
}
