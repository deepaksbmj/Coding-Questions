package com.practice;

public class NextPermutation1 {
	public static void nextPermutation(int[] nums) {
        int k,n = nums.length, m, rc=nums.length-1;
        if(nums == null || nums.length <=1)
        	return;
        
        for(k=n-2;k>=0;k--){
            if(nums[k] < nums[k+1] )
            {
                break;
            }
        }
        
        if(k>=0) {
        	int j = n-1;
        	while(nums[j]<=nums[k]) {
        		j--;
        	}
        	swap(nums, k , j);
        	
        }
        reverse(nums, k+1, n-1);
    }
	
	public static void swap(int [] A, int i, int j) {
		int t = A[i];
		A[i] = A[j];
		A[j] = t;
	}
	
	public static void reverse(int[] A, int i, int j) {
		while(i<j) {
			swap(A,i++,j--);
		}
	}	

	public static void main(String[] args) {
		
		int a[] = {1,3,5,4,2};
		nextPermutation(a);
		for(var x : a) {
			System.out.println(x);
		}
	}

}
