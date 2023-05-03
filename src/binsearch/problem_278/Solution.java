package binsearch.problem_278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return search(n);
    }

    public int search(int high) {

        int low = 0;
        int firstBad = high;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (!isBadVersion(mid)) {
                low = mid + 1;
            } else if (isBadVersion(mid)) {
                firstBad = mid;
                high = mid - 1;
            }
        }
        return firstBad;
    }
}