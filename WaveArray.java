package com.practice;

public class WaveArray {

	public static void convertToWave(int n, int[] a) {
		for(int i=0;i<n-1;i=i+2) {
			int t = a[i];
			a[i] = a[i+1];
			a[i+1] = t;
		}

	}

	public static void main(String[] args) {
		int arr[] = {2,4,7,8,9,10};
		convertToWave(arr.length, arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
