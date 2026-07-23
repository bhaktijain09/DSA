public class stock_buy_and_sell {
    

    public int maxProfit(int[] prices) {

        // Variables used:
        // priceToday      - Current stock price
        // minBuyingPrice  - Lowest price seen so far
        // profitToday     - Profit if sold today
        // maxProfit       - Maximum profit found so far

        int minBuyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int priceToday : prices) { // Traverse each day's stock price

            // Update the lowest buying price seen so far
            minBuyingPrice = Math.min(priceToday, minBuyingPrice);

            // Calculate profit if sold today
            int profitToday = priceToday - minBuyingPrice;

            // Update maximum profit
            maxProfit = Math.max(profitToday, maxProfit);
        }

        return maxProfit;
    }
}