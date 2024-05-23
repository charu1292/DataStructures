package DP_on_Stocks;

public class BestTimeBuyNSell {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int profit = 0;
        int minibuy = prices[0];
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minibuy) {
                int cost=prices[i] - minibuy;
                profit = Math.max(profit, cost);
                sellDay = i;
            } else {
                minibuy = prices[i];
                buyDay=i;
            }
        }

        // Adjust buyDay to reflect the day when the min buy price was set
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == minibuy) {
                buyDay = i;
                break;
            }
        }
        System.out.println("Buy on day: " + buyDay + ", Sell on day: " + sellDay);
        return profit;
    }

    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));



    }
}
