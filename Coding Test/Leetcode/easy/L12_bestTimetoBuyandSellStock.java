package leetcode;

public class L12_bestTimetoBuyandSellStock {

  public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      int profit = prices[i] - minPrice;
      maxProfit = Math.max(maxProfit,profit);
      minPrice = Math.min(minPrice, prices[i]);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    L12_bestTimetoBuyandSellStock l = new L12_bestTimetoBuyandSellStock();
    int[] prices1 = new int[]{7,1,5,3,6,4};
    System.out.println(l.maxProfit(prices1));
  }

}
