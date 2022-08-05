package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceElementsinArray {
	private static int i;

	public static int[] arrayChange(int[] nums, int[][] operations) {
		int r = operations.length;
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i =0;i<r;i++) {
			int n = operations[i][0];
			int rn = operations[i][1];
			nums= arrayReplace(nums, n,rn);
		}
		return nums;
	}

	public static int[] arrayReplace(int []a, int n, int r) {
		List<Integer> l = Arrays.stream(a).boxed().toList();
		l = l.stream().map(i -> i==n?r:i).toList();
				
		return l.stream().mapToInt(Integer::intValue).toArray();
	}

	//	public static boolean containsOverload(List<Integer> l , int num) {
	//		for(int i =0;i<l.size();i+=2) {
	//			if(l.get(i) == num)
	//				return true;
	//		}
	//		return false;
	//	}
	//	
	//	public static int indexOfOverload(List<Integer> l , int num) {
	//		for(int i =0;i<l.size();i+=2) {
	//			if(l.get(i) == num)
	//				return i;
	//		}
	//		return -1;
	//	}

	public static void main(String[] args) {
		int nums[] = {1,2}, operations[][] = {{1,3},{2,1},{3,2}};
		int b [] = arrayChange(nums, operations);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+",");
		}
	}

}
