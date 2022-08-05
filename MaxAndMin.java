package com.practice;

public class MaxAndMin {

	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		getMinMax(arr,arr.length);
	}

	private static void getMinMax(int[] arr, int length) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<length; i++) {
			if(arr[i]>=max)
				max = arr[i];
			else if(arr[i]<min)
				min = arr[i];
		}
		System.err.println("MIN = "+min+", MAX = "+max);
	}

}
