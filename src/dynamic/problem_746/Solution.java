package dynamic.problem_746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int costPrev = cost[0];
        int costNow = cost[1];
        for (int i = 2; i < n; i++) {
            int calc = cost[i] + Math.min(costNow, costPrev);
            costPrev = costNow;
            costNow = calc;
        }
        return Math.min(costNow, costPrev);
    }
}
