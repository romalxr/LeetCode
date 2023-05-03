package binsearch.problem_35;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            index = mid;
            if (nums[mid] < target) {
                low = mid + 1;
                index = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                break;
            }
        }
        return index;
    }
}