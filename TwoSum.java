package com.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int r[] = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(i = 0; i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                r[0] = map.get(target-nums[i]);
                r[1] = i;
                return r;
            }else{
                map.put(nums[i],i);
            }
        }
        return r;
    }

	public static void main(String[] args) {

		int a[] = {2,5,6,7,11,15};
		int b [] = twoSum(a, 9);
		for(var x:b) {
			System.out.print(x);
		}
	}

}
