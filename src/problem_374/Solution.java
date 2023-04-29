package problem_374;

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int low = 0;
        int high = Integer.MAX_VALUE;
        int result = guess(n);
        while(result != 0) {
            if (result < 0) {
                high = n;
            } else {
                low = n + 1;
            }
            n = low  + ((high - low) / 2);
            result = guess(n);
        }

        return n;
    }
}
