package DP_on_Stocks;

//
import java.util.ArrayList;
import java.util.List;

public class BestTimeBuyNSell3 {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        List<Integer> buyDays = new ArrayList<>();
        List<Integer> sellDays = new ArrayList<>();

        int i = 0;
        while (i < prices.length - 1) {
            // Find the next local minimum as a buy point
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            if (i < prices.length - 1) {
                buyDays.add(i);  // Record the buy day
            }

            // Move to the next day after buying
            i++;

            // Find the next local maximum as a sell point
            while (i < prices.length && prices[i] >= prices[i - 1]) {
                i++;
            }
            if (i - 1 > 0 && !buyDays.isEmpty()) {
                sellDays.add(i - 1);  // Record the sell day
                profit += prices[i - 1] - prices[buyDays.get(buyDays.size() - 1)];
            }
        }

        // Print the transactions
        for (int j = 0; j < buyDays.size(); j++) {
            System.out.println("Buy on day: " + buyDays.get(j) + ", Sell on day: " + sellDays.get(j));
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}