package com.practice;

public class SortColors {

	public static void sortColors(int[] nums) {
        int n = nums.length;
        int c0,c1,c2;
        c0=c1=c2=0;
        for(int i=0;i<n;i++){
            switch(nums[i]){
                case 0: c0++;
                    break;
                case 1: c1++;
                    break;
                case 2: c2++;
                    break;
            }
        }
        
        for(int i=0;i<n;i++){
           if(c0!=0){
               nums[i] = 0;
               c0--;
           }
            else if(c1!=0){
                nums[i] = 1;
                c1--;
            }
            else if(c2!=0){
            	nums[i] = 2;
                c2--;
            }
        }
    }
	
	public static void main(String[] args) {
        int profit=0,min=Integer.MAX_VALUE;

		int a [] = {2,0,2,1,1,0};
		sortColors(a);
		for (int i : a) {
			System.out.print(i+", ");
		}
	}

}
