package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInAnArray {

	public static int findDuplicate(ArrayList<Integer> arr, int n){
		int s = arr.stream().mapToInt(Integer::intValue).sum();
		Set<Integer> set = arr.stream().collect(Collectors.toSet());
		int ss = set.stream().mapToInt(Integer::intValue).sum();
		int diff = arr.size() - set.size();
		int sum = s-ss;
		return sum/diff;
	}

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(4,5,8, 4, 6, 1, 2, 3,4,4, 7, 4,4,4);
		ArrayList<Integer> al  = new ArrayList<>(l);
		System.out.println(findDuplicate(al, 12));

	}

}
