package problem_852;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return search(arr);
    }
    public int search(int[] nums) {

        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if(low == high) {
                index = low;
                break;
            }
            int mid = low  + ((high - low) / 2) + 1;
            if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                index = mid;
                break;
            } else if (nums[mid - 1] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
