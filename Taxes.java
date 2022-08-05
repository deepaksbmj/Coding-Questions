package com.practice;

public class Taxes {

	public static double calculateTax(int[][] brackets, int income) {
		int r = brackets.length;
		double p = 0.0;
		if(income == 0)
			return 0.00000;
		for(int i=0;i<r;i++) {
			if(i==0) {
				double per = brackets[0][1]/100.00000;
				p = brackets[0][0]*per;
				income = income-brackets[0][0];
			}else {
				int m = Math.min(income, brackets[i][0]-brackets[i-1][0]);
				System.out.println(m);
				income = income - m;
				if(income<=0)
					break;
			}
		}
		 return Double.valueOf(String.format(".%5f", p));
	}

	public static void main(String[] args) {
		int brackets[][] = {{3,50},{7,10},{12,25}}, income = 10;
		System.out.println(calculateTax(brackets, income));

	}

}
