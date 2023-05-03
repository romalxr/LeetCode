package binsearch.problem_367;

class Solution {
    public boolean isPerfectSquare(int num) {
        return search(num) != -1;
    }
    public int search(int target) {

        int index = -1;
        int low = 0;
        int high = 46340; // sqrt(Integer.MAX_VALUE)

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (mid * mid < target) {
                low = mid + 1;
            } else if (mid * mid > target) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
