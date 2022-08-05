package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		if(permutation.size()<=1)
            return permutation;
        int i = permutation.size()-2;
        while(i>=0 && permutation.get(i) >= permutation.get(i+1) )
            i--;
        if(i>=0) {
        	int j = permutation.size()-1;
        	while(permutation.get(j)<=permutation.get(i))
        		j--;
        	swap(permutation,i,j);
        }
        reverse(permutation,i+1,permutation.size()-1);
        
        return permutation;
	}
	
	public static void swap(ArrayList<Integer> A, int i, int j) {
		int t = A.get(i);
		A.set(i, A.get(j));
		A.set(j, t);
	}
	
	public static void reverse(ArrayList<Integer> A, int i, int j) {
		while(i<j) {
			swap(A,i++,j--);
		}
	}	

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println("list = "+list);
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		System.out.println(nextPermutation(al));
	}

}
