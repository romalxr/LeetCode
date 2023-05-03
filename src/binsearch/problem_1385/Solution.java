package binsearch.problem_1385;

import java.util.Arrays;

class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);
        int count = 0;
        for (int a : arr1) {
            if (search(arr2, a, d) == -1) {
                count++;
            }
        }
        return count;
    }

    public int search(int[] nums, int target, int d) {

        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] < target - d) {
                low = mid + 1;
            } else if (nums[mid] > target + d) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
