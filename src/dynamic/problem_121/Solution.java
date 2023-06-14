package dynamic.problem_121;

class Solution {
    public int maxProfit(int[] prices) {

        int min = 10001;
        int max = 0;
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }

        return max;
    }
}
