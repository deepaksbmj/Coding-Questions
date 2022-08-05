package com.practice;

import java.util.ArrayList;

public class ReversePairs {
	public static int reversePairs(int[] nums) {
        int i,j,n=nums.length,c=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(i<j && nums[i] > 2* nums[j]){
                	System.out.println(i+", "+j);
                    c++;
                }
            }
        }
        return c;
    }

	public static long reversePairs2(int arr[]) {
		int n = arr.length;

        return mergeSort(arr, 0, n-1);
    }
 
 public static int merge(int arr[], int left , int mid, int right){
	 	
        int i,j;
        int inv_count = 0;
        j = mid +1;
        for(i=left;i<=mid;i++) {
        	while(j<=right && arr[i] > (2 * (long) arr[j]))
        	{
        		j++;
        	}
        	inv_count +=(j - (mid+1));
        }
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int l = left;
        int r = mid+1;
        
        while((l<=mid) &&(r<=right)){
            if(arr[l] <=arr[r]){
                temp.add(arr[l++]);
            }else{
                temp.add(arr[r++]);
            }
        }
        
        while(l<=mid){
                temp.add(arr[l++]);
        }
        
        while(r<=right){
        	temp.add(arr[r++]);
        }
        
        for(i = left; i<=right;i++){
            arr[i] = temp.get(i-left);
        }
        
        return inv_count;
    }
    
    public static int mergeSort(int arr[], int left, int right){
        int mid; 
        int inv_count = 0;
        if(left < right){
            mid = left + (right-left)/2;
            inv_count += mergeSort(arr, left , mid);
            inv_count += mergeSort(arr, mid + 1 , right);
            
            inv_count += merge(arr, left , mid+1, right);
        }
        return inv_count;
    }
	public static void main(String[] args) {
		int a[] = {40,25,19,12,9,6,2};
		System.out.println("No. of pairs = "+ reversePairs2(a));
	}

}
