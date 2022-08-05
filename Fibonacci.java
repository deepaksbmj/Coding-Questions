package com.practice;

public class Fibonacci {

	public static void fibo(int n) {
		int x =1, y=1, z=0;
		System.out.print(x+","+y+",");
		
		for(int i=0;i<n;i++) {
			z= x+y;
			System.out.print(z+",");
			x=y;
			y=z;
		}
	}
	
	public static int fibor(int n) {
		if(n<=1)
			return n;
		return fibor(n-1)+fibor(n-2);
	}
	
	public static boolean palindrome(String s) {
		if(s == null || s.length() <=0)
			return true;
		
		return isPal(s,0,s.length()-1);
	}

	private static boolean isPal(String s, int i, int j) {
		if(i ==j)
			return true;
		if(s.charAt(i) != s.charAt(j))
			return false;
		return isPal(s, i+1, j-1);
	}

	public static void main(String[] args) {
		System.out.println(fibor(9));
		
		String s = "nitin";
		boolean x = palindrome(s);
		if(x) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
//		fibo(10);
	}

}
