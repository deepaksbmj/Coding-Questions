package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int c =0, ca= 0;
		for(int i : nums)
		{
			if(c==0)
				ca=i;
			if(i ==ca)
				c+=1;
			else
				c-=1;
		}
		return ca;
	}
	
	public static int majorityElement1(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int avg = nums.length/2;
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
				if(val>=avg)
					return nums[i];					
				map.put(nums[i],++val);
			}else {
				map.put(nums[i],1);
			}
		}
		return nums[0];
	}
	
	public static List<Integer> majorityElement2(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer>s = new HashSet<>();
		int avg = nums.length/3;
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int val = map.get(nums[i]);			
				map.put(nums[i],++val);
			}else {
				map.put(nums[i],1);
			}
		}
		
		map.forEach((k,v)-> {
			if(v > avg) {
				s.add(k);
			}
		});
			return s.stream().collect(Collectors.toList());
	}
	
	public static List<Integer> majorityElement21(int[] nums) {
		int num1 = -1, num2 =-1, c1 = 0, c2 = 0, n = nums.length;
		for(int i = 0 ; i < n ; i++) {
			if(num1 == nums[i])
				c1++;
			else if(num2 == nums[i])
				c2++;
			else if(c1 == 0) {
				num1 = nums[i];
				c1=1;
			}
			else if(c2 == 0) {
				num2 = nums[i];
				c2=1;
			}
			else {
				c1--;
				c2--;
			}
		}
		
		List<Integer> l = new ArrayList<>();
		int count1 =0, count2= 0;
		for(var a : nums) {
			if(a == num1) {
				count1++;
			} else if(a == num2) {
				count2++;
			}
		}
		
		if(count1>n/3)
			l.add(num1);
		if(count2>n/3)
			l.add(num2);
		
		return l;
	}

	public static void main(String[] args) {
		int a[] = {1,2	};
		System.out.println(majorityElement21(a));

	}

}
