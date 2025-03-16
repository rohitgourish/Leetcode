class Solution {
    public int maxProfit(int[] prices) {
        int minVal = prices[0];
        int maxProfit = 0;
        int cost;
        for(int i = 1; i< prices.length; i++) {
            cost = prices[i] - minVal;
            maxProfit = Math.max(cost, maxProfit);
            minVal = Math.min(minVal, prices[i]);
        }

        return maxProfit;

    }
}