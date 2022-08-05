package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MinMaxGame {
	public static int minMaxGame(int[] nums) {
		if(nums.length == 1)
			return nums[0];
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<nums.length/2;i++) {
			if(i%2==0)
				l.add(Math.min(nums[2 * i], nums[2 * i + 1]));
			else
				l.add(Math.max(nums[2 * i], nums[2 * i + 1]));
		}
		return minMaxGame(l.stream().mapToInt(Integer::intValue).toArray());
	}

	public static void main(String[] args) {
		int nums[] = {1,3,5,2,4,8,2,2};
		System.out.println(minMaxGame(nums));
	}

}
