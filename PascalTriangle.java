package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static List<Integer> generateList(List<Integer> l, int num){
		List<Integer>x = new ArrayList<Integer>();
		for(int i =0;i<l.size();i++) {
			if(i==0) {
				x.add(1);
			}else {
				x.add(l.get(i)+l.get(i-1));
			}
		}
		x.add(1);
		return x;
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
			List<Integer>l = new ArrayList<Integer>();
			if(i == 0){
				l.add(1);
			}
			else if(i == 1){
				l.add(1);
				l.add(1);
			}
			if( i > 1)
			{
				l = ll.get(i-1);
				l = generateList(l, i+1);
			}            
			ll.add(l);
		}
		return ll;
	}

	public static void main(String[] args) {
		Long sT = System.currentTimeMillis();
		List<List<Integer>> ll = generate(500);
		Long eT = System.currentTimeMillis();
		System.out.println(ll);
		System.out.println("Time taken - "+(eT-sT));
		
	}

}
