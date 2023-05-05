package binsearch.problem_1539;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        return search(arr, k);
    }
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] - (mid + 1) < target) {
                low = mid + 1;
            } else if (nums[mid] - (mid + 1) > target) {
                high = mid - 1;
            } else if (nums[mid] - (mid + 1) == target) {
                high = mid - 1;
            }
        }
        if (low == 0) return target;
        return target - (nums[high] - (high + 1)) + nums[high];
    }
}
