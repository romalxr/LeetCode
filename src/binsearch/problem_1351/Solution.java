package binsearch.problem_1351;

class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0;
        for (int[] nums : grid) {
            result += search(nums);
        }
        return result;
    }

    public int search(int[] nums) {

        int result = 0;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] >= 0) {
                low = mid + 1;
            } else if (nums[mid] < 0) {
                result += high - mid + 1;
                high = mid - 1;
            }
        }
        return result;
    }
}
