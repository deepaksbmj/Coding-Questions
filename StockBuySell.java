package com.practice;

public class StockBuySell {

	public static int maxProfit(int[] prices) {
		int profit=0,min=Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++){
			min = Math.min(min,prices[i]);
			profit = Math.max(profit, prices[i]-min);
		}
		return profit;
	}

	public static void main(String[] args) {
		int a[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(a));
	}

}
