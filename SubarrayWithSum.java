package com.practice;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarrayWithSum{
	public static void main(String[] args) {
		int N = 10, S = 15;
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		Solution obj = new Solution();
		ArrayList<Integer> res = obj.subarraySum(A, N, S);
		for(int ii = 0;ii<res.size();ii++)
			System.out.print(res.get(ii) + " ");
	}

}


class Solution
{
	//Function to find a continuous sub-array which adds up to a given number.
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		return null;

	}
}