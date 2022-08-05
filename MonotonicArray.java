package com.practice;

public class MonotonicArray {

	public static boolean isMonotonic(int[] nums) {
        int incr, decr, eq;
        incr = decr= eq = 0;
        for(int i = 1 ;i<nums.length;i++) {
        	if(nums[i]>nums[i-1]) {
        		incr++;
        	}else if(nums[i]<nums[i-1]){
        		decr++;
        	}	
        	else {
        		eq++;
        	}
        }
        
        if((incr>0 || eq>=0 )&& decr == 0)
        	return true;
        else if((decr>0  || eq>=0 ) && incr==0)
        	return true;
        else
        	return false;
    }
	
	public static void main(String ...args) {
		int a[] = {4,3,3,2,0,1};
		System.out.println(isMonotonic(a));
	}
}
