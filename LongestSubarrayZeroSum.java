package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSubarrayZeroSum {
	public static int LongestSubsetWithZeroSum(List<Integer> arr) {
			HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
			int max=0, sum=0;
			int n = arr.size();
			for(int i=0;i<n;i++) {
				sum+=arr.get(i);
				if(sum ==0 ) {
					max = i+1;
				}
				else {
					if(map.get(sum) != null) {
						max = Math.max(max, i-map.get(sum));
								
					}else {
						map.put(sum, i);
					}
				}
			}
			return max;
	}
	
	public static List<List<Integer>> subsets(List<Integer> arr) {
		
		List<List<Integer>> ss = new ArrayList<List<Integer>>();
		int n = arr.size();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				List<Integer> l = new ArrayList<Integer>();
				l.add(arr.get(i));
				l.add(arr.get(j));
				ss.add(l);
			}
		}
		return ss;
}

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(1, 3, -1, 4, -4);
		List<List<Integer>> res = subsets(a);
		for(List<Integer> i : res) {
			System.out.println(i);
		}

	}

}
