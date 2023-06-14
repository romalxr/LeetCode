package dynamic.problems_714;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell = 0;
        int buy = prices[0];
        int ans = 0;
        for (int price : prices) {
            sell = Math.max(sell, price);
            if (price + fee < sell || price < buy) {
                ans += Math.max(0, sell - buy - fee);
                buy = price;
                sell = price;
            }
        }
        ans += Math.max(0, sell - buy - fee);
        return ans;
    }

    public int maxProfit2(int[] prices, int fee) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy + fee) {
                profit += prices[i] - buy - fee;
                buy = prices[i] - fee;
            }
        }

        return profit;
    }
}
