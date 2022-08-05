package com.practice;

public class HappyNumber {

	public static int squaresSum (int n) {
        int sum = 0, r = 0;
        while (n > 0) {
        	r = n%10;
            sum += r*r;
            n = n/10;
        }
        return sum;
    }
	
	public static boolean isHappy(int n) {
		if(n==0)
			return false;
		else {
			int ss = squaresSum(n);
			while(ss>0) {
				ss= squaresSum(ss);
				if(ss == 1)
					return true;
				else if(ss < 10)
					return false;
			}
		}		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

}
