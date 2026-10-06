class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE , sell = 0 , profit = 0 ;

        for(int i = 0 ; i < prices.length ; i++ ){
            buy = Math.min(buy,prices[i]);
            int currProfit = prices[i] - buy ;
            profit = Math.max(profit,currProfit);
        }

        return profit;
    }
}