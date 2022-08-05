package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		int i,j,left,right, n=nums.length;
		List<List<Integer>> l = new ArrayList<List<Integer>>();

		if(nums == null || n <= 0)
			return l;

		for(i=0;i<n;i++) {
			for(j = i+1;j<n;j++) {
				long remSum = target-nums[j];
				remSum -=nums[i];
				left = j+1;
				right = n-1;
				while( left < right) {
					long twoSum = nums[left] + nums[right];
					
					if(twoSum < remSum)
						left++;
					else if(twoSum > remSum)
						right--;
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[left]);
						quad.add(nums[right]);
						l.add(quad);
						
						//3rd number duplicate check
						while(left < right && nums[left] == quad.get(2))
							++left;
						
						//4th number duplicate check
						while(left < right && nums[right] == quad.get(3))
						--right;
					}
				}
				//2nd number duplicate check
				while(j+1 < n && nums[j+1] == nums[j])
					++j;
			}
			//1st number duplicate check
			while(i+1 < n && nums[i+1] == nums[i])
				++i;
		}
		return l;
	}

	public static void main(String[] args) {
				
		int nums[] = {1000000000,1000000000,1000000000,1000000000}, target = -294967296;
		List<List<Integer>> res = fourSum(nums, target);
		System.out.println("answer got");
		for(var x : res) {
			System.out.println(x);
		}
	}

}
