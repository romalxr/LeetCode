package dynamic.problem_1137;

class Solution {
    public int tribonacci(int n) {
        if (n <= 2) return Math.min(n, 1);
        int prevprev = 0;
        int prev = 1;
        int now = 1;
        for(int i = 2; i < n; i++)
        {
            int curr = now + prev + prevprev;
            prevprev = prev;
            prev = now;
            now = curr;
        }
        return now;
    }
}
