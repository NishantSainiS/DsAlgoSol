public class BestTimetoBuyandSellStock_121 {
     // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     class Solution {
          public int maxProfit(int[] prices) {
               int ans = 0;
               int best_buy = prices[0];
               for (int i = 0; i < prices.length; i++) {
                    best_buy = Math.min(best_buy, prices[i]);
                    int tsp = prices[i] - best_buy;
                    ans = Math.max(tsp, ans);
               }
               return ans;
          }
     }
}
