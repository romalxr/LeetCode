package binsearch.problem_167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            int b = target - a;
            int j = search(numbers, b);
            if (j != -1 && j != i) {
                if (i > j) {
                    return new int[]{j + 1, i + 1};
                } else {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[] {};
    }

    public int search(int[] nums, int target) {

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
                break;
            }
        }
        return index;
    }
}
