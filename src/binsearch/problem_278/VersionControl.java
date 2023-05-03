package binsearch.problem_278;

public class VersionControl {

    int bad = 0;
    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}
