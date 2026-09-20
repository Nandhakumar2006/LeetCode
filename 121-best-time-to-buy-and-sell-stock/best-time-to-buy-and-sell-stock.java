class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,sell=0,profit=0;
        for(int i=0;i<prices.length-1;i++){

            buy=Math.min(buy,prices[i]);
            sell=prices[i+1];
            int diff = sell-buy;
            profit=Math.max(profit,diff);
        }

        return profit;
    }
}