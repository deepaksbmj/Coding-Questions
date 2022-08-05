package com.practice;

public class RotateSingleArray {
	public static void rev(int []a, int l, int r, int k) {
		while(l<r) {
			int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;            
            r--;
		}
	}
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<=1 || k<1) {
        	for(var x : nums) {
            	System.out.print(x+", " );
            }
        	return;
        }
        if(n == 2) {
        	if(k%2 ==0) {
        		return;
        	}else {
        		int t = nums[0];
        		nums[0] = nums[1];
        		nums[1] = t;
        	}
        	 return;
        }
        int l = 0, r = n-1;
        while(l<r && l<k){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;            
            r--;
        }
        
        rev(nums, 0 , k-1, k);
        rev(nums, k , n-1, k);
        
        for(var x : nums) {
        	System.out.print(x+", " );
        }
    }

	public static void main(String[] args) {
		int a[] = {1,2,3};
		rotate(a, 4);
	}

}
