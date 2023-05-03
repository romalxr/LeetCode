package binsearch.problem_69;

class Solution {
    public int mySqrt(int x) {
        return search(x);
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
        return index == -1 ? high : index;
    }

}
