package dynamic.problem_70;

class Solution {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int now = 2;
        int prev = 1;
        for (int i = 2; i < n; i++) {
            int calc = now + prev;
            prev = now;
            now = calc;
        }
        return now;
    }
}
