package src.leetcode.challenges.day3;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int num[]) {  // num: [ 7, 1, 5, 3, 6, 4]  num : [7, 6, 4, 3, 1]  {7, 6, 9, 1, 3, 2}
        int minValue = 0;
        int maxValue = 0;
        int maxDifference = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[minValue]) {
                maxDifference = Integer.max(maxDifference, num[maxValue] - num[minValue]);
                minValue = i;
                maxValue = i;
            }
            if (num[maxValue] <= num[i]) {
                maxValue = i;
            }
        }

        if (minValue > maxValue)
            return 0;
        return  Integer.max(maxDifference, num[maxValue] - num[minValue]);
    }
//Approach Two
    public int maxProfitTwo(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }
            else if((prices[i] - minValue) > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock buyAndSellStock = new BestTimeToBuyAndSellStock();
        buyAndSellStock.test1();
        buyAndSellStock.test2();
        buyAndSellStock.test3();
        buyAndSellStock.test4();
        buyAndSellStock.test5();
        buyAndSellStock.test6();
    }

    public void test1() {
        int nums[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public void test2() {
        int nums[] = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(nums));
    }

    public void test3() {
        int nums[] = {7, 6, 8, 6, 5, 6};
        System.out.println(maxProfit(nums));
    }


    public void test4() {
        int nums[] = {7, 6, 9, 1, 3, 2};
        System.out.println(maxProfit(nums));
    }

    public void test5() {
        int nums[] = {2, 4, 1};
        System.out.println(maxProfit(nums));
    }

    public void test6(){
        int nums[] = { 4, 7, 2, 1};
        System.out.println(maxProfit(nums));
    }
}
