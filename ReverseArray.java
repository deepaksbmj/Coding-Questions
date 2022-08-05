package com.practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = {4,5,1,2};
		iterativeWay(a,0,a.length-1);
		recursiveWay(a,0,a.length-1);
	}

	private static void iterativeWay(int[] a, int s, int e) {
		while(s<=e) {
			
			int t = a[s];
			a[s]=a[e];
			a[e]=t;
			
			s++;
			e--;
		}
		
		Arrays.stream(a).forEach(System.out::print);
		
	}

	private static void recursiveWay(int[] a, int s, int e) {
		if(s>=e)
			return;
		int t = a[s];
		a[s] = a[e];
		a[e] = t;
		recursiveWay(a, s+1, e-1);
	}


}
