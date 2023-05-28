package dynamic.problem_509;

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int prev = 0;
        int now = 1;
        for(int i = 1; i < n; i++)
        {
            int curr = now + prev;
            prev = now;
            now = curr;
        }
        return now;
    }
}
