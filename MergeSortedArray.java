package com.practice;

public class MergeSortedArray {

	public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i=m-1,j = n-1, k=(m+n-1);
       while(i>=0 && j>= 0){
           if(arr1[i]>arr2[j]){
               arr1[k--] = arr1[i--];
           }else{
               arr1[k--] = arr2[j--];
           }
       }
       while(j>=0){
           arr1[k--] = arr2[j--];
       }
       while(i>=0)
       {
           arr1[k--] = arr1[i--];
       }
       return arr1;
   }
	
	public static void main(String[] args) {
		int a[] = {3,6,9,0,0};
		int b[] = {4,10};
		
		int[] c = ninjaAndSortedArrays(a, b, 3, 2);
		
		for(int i : c) {
			System.out.print(i+", ");
		}
	}

}
