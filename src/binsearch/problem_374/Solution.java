package binsearch.problem_374;

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int index = -1;
        int low = 0;
        int high = n;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (guess(mid) > 0) {
                low = mid + 1;
            } else if (guess(mid) < 0) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
