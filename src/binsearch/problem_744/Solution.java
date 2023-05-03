package binsearch.problem_744;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return letters[search(letters, (char) (target + 1))];
    }

    public int search(char[] nums, char target) {

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

        if (index != -1) {
            return index;
        }
        if (low >= nums.length) {
            return 0;
        } else {
            return low;
        }
    }

}
