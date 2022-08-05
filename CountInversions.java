package com.practice;

public class CountInversions {
	 public static long getInversions(long arr[], int n) {
	     int i,j; 
	     long c=0;
	     for(i =0;i<n;i++) {
	    	 for(j=i+1;j<n;j++) {
	    		 
	    		 if(i<j && arr[i]>arr[j]) {
	    			 System.out.println(arr[i]+" "+arr[j]);
	    			 c++;
	    		 }
	    	 }
	     }
	     return c;
		 
	    }
	 
	 public static long getInversionsUsingMerge(long arr[], int n) {
	        long temp[] = new long[n];
	        return mergeSort(arr, temp, 0, n-1);
	    }
	 
	 public static long merge(long arr[], long temp[], int left , int mid, int right){
	        int i,j,k;
	        long inv_count = 0;
	        
	        i = left;
	        j = mid;
	        k = left;
	        
	        while((i<=mid-1) &&(j<=right)){
	            if(arr[i] <=arr[j]){
	                temp[k++] = arr[i++];
	            }else{
	                temp[k++] = arr[j++];
	                
	                inv_count = inv_count +(mid-i);
	            }
	        }
	        
	        while(i<=mid-1){
	                temp[k++] = arr[i++];
	        }
	        
	        while(j<=right){
	                temp[k++] = arr[j++];
	        }
	        
	        for(i = left; i<=right;i++){
	            arr[i] = temp[i];
	        }
	        
	        return inv_count;
	    }
	    
	    public static long mergeSort(long arr[], long temp[], int left, int right){
	        int mid; 
	        long inv_count = 0;
	        if(left < right){
	            mid = left + (right-left)/2;
	            inv_count += mergeSort(arr, temp, left , mid);
	            inv_count += mergeSort(arr, temp, mid + 1 , right);
	            
	            inv_count += merge(arr, temp, left , mid+1, right);
	        }
	        return inv_count;
	    }
	    

	public static void main(String[] args) {
		long [] a = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162
};
		System.out.println(getInversionsUsingMerge(a, a.length));

	}

}
