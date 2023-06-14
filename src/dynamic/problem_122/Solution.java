package dynamic.problem_122;

class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = prices[0];
        int ans = 0;
        for (int price : prices) {
            sell = Math.max(sell, price);
            if (price < sell) {
                ans += sell - buy;
                buy = price;
                sell = price;
            }
        }
        ans += sell - buy;
        return ans;
    }
}
