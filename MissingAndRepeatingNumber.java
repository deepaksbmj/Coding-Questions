package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingAndRepeatingNumber {

	 public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
	        int c [ ] = new int[2];
	        int sf = (n*(n+1))/2;
	        int s = arr.stream().mapToInt(Integer::intValue).sum();
			Set<Integer> set = arr.stream().collect(Collectors.toSet());
			int ss = set.stream().mapToInt(Integer::intValue).sum();
			c[0] = sf-ss;
			c[1] = s-ss;
			return c;
	    }
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(4, 5, 2 ,9 ,8 ,1, 1 ,7 ,10, 3);
		ArrayList<Integer> al  = new ArrayList<>(l);
		int c[] = missingAndRepeating(al, 10);
		System.out.print(c[0]+", "+c[1]);
	}

}
