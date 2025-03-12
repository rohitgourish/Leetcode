class Solution {
    public int maxProfit(int[] prices) {
        int minimumVal = prices[0];
        int maxProfit = 0;
        int cost;
        for(int i = 1; i< prices.length;i++){
            cost = prices[i] - minimumVal;
            maxProfit = Math.max(cost, maxProfit);
            minimumVal = Math.min(minimumVal, prices[i]);
        }

        return maxProfit;
    }
}