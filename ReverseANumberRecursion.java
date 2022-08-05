package com.practice;

public class ReverseANumberRecursion {

	public static void main(String[] args) {
		rev(987);
	}

	private static void rev(int i) {
		if(i==0)
			return;
		System.out.print(i%10);
		rev(i/10);
	}

}
