package com.practice;

public class Sqrt {

	public static int mySqrt(int x) {
		long s =1, e =x;
		while(s<=e) {
			long m = (s+e)/2;
			if(m*m == x)
				return (int) m;
			else if(m*m>x)
				e = m-1;
			else
				s = m+1;
		}
		return (int)e;
	}

	public static void main(String[] args) {
		
		System.out.println(mySqrt(8));

	}

}
