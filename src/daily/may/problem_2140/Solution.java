package daily.may.problem_2140;

class Solution {
    public long mostPoints(int[][] questions) {
        long prev = 0;
        int n = questions.length;
        long[] sums = new long[n + 1];

        for (int i = 0; i < questions.length; i++) {
            prev = Math.max(prev, sums[i]);
            long now = prev + questions[i][0];
            int ind = Math.min(i + 1 + questions[i][1], n);
            sums[ind] = Math.max(sums[ind], now);
        }
        return sums[n];
    }
}
