package com.practice;

public class RotateArrayByK {
	
	public static void r(int arr[], int l, int h)
    {
        while(l<h)
        {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            
            l++;
            h--;
        }
    }
    public static void rotate(int[] arr, int k) {
        k = k%arr.length;
        
        r(arr, 0, arr.length-1);
        r(arr, 0, k-1);
        
        r(arr, k, arr.length-1);
    }

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		rotate(a, 3);

		for(var i : a) {
			System.out.println(i);
		}
	}

}
