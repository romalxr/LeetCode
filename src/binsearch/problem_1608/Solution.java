package binsearch.problem_1608;

import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);
        if (nums[0] >= nums.length) return nums.length;
        return search(nums);

    }

    public int search(int[] nums) {

        int index = -1;
        int low = 1;
        int high = nums.length - 1;

        while (low <= high) {
            int i = low  + ((high - low) / 2);
            int j = nums.length - i;
            if (nums[i] < j) {
                low = i + 1;
            } else if (nums[i - 1] >= j) {
                high = i - 1;
            } else {
                index = j;
                break;
            }
        }
        return index;
    }
}
