package com.practice;

public class TwoSum2 {
	public static int[] twoSum(int[] numbers, int target) {
		int i =0, sum =0,j=numbers.length-1;        
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }else if(sum<target)
            {
                i++;
            }
            else{
                return new int[] {i+1, j+1};
            }
        }
		return numbers;
    }

	public static void main(String[] args) {
		int a[] = {2,5,6,7,11,15};
		int b [] = twoSum(a, 9);
		for(var x:b) {
			System.out.print(x);
		}
	}

}
