package dynamic.problem_309;

class Solution {
    public int maxProfit(int[] prices) {
        int buy0 = -prices[0];
        int buy1 = buy0;
        int sell0 = 0;
        int sell1 = 0;
        int sell2 = 0;

        for (int i = 1; i < prices.length; i++) {
            buy0 = Math.max(buy1, sell2 - prices[i]);
            sell0 = Math.max(sell1, buy1 + prices[i]);
            buy1 = buy0;
            sell2 = sell1;
            sell1 = sell0;
        }
        return sell0;
    }
}
