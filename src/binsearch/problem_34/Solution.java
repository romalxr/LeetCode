package binsearch.problem_34;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int a = search(nums, target, true);
        int b = search(nums, target, false);

        return new int[]{ a, b };
    }

    public int search(int[] nums, int target, boolean first) {

        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                if (first) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return index;
    }
}
