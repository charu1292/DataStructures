package DP_on_Stocks;

//user can buy and sell as many times but buy day n sell day is not same
import java.util.ArrayList;
import java.util.List;

public class BestTimeBuyNSell2 {

    //check at which index we buy first
    //explore possiblities on that day
    //maximise rhe profit

        public static int maxProfit(int[] prices) {
            int profit = 0;
            List<Integer> buyDays = new ArrayList<>();
            List<Integer> sellDays = new ArrayList<>();

            for (int i = 0; i < prices.length - 1; i++) {
                if (prices[i] < prices[i + 1]) {
                    buyDays.add(i);
                    sellDays.add(i + 1);
                    profit += prices[i + 1] - prices[i];
                }
            }
            // Print the transactions
            for (int j = 0; j < buyDays.size(); j++) {
                System.out.println("Buy on day: " + buyDays.get(j) + ", Sell on day: " + sellDays.get(j));
            }

            return profit;
        }

    public static void main(String[] args) {
       int prices[] ={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
