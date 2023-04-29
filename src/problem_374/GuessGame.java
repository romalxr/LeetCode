package problem_374;

public class GuessGame {

    private int pick = 0;

    public void setPick(int pick) {
        this.pick = pick;
    }

    int guess(int num) {
        return Integer.compare(pick, num);
    }

}
