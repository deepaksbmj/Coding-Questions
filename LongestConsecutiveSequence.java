package com.practice;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(var i:nums) {
			set.add(i);
		}

		int c=0;
		for(int i : nums) {
			if(!set.contains(i-1)) {
				int cn = i;
				int cs = 1;
				while(set.contains(cn+1)) {
					cn+=1;
					cs+=1;
				}
				c=Math.max(c,cs);
			}
		}
		return c;
	}


	public static void main(String[] args) {
		int a[] = {3,7,2,5,8,4,6,1};
		System.out.println(longestConsecutive(a));
//		System.out.println("sum is - "+sum(a));
	}

}
