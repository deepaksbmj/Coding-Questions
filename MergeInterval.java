package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MergeInterval {

	public static int[][] merge(int[][] intervals) {
		List<int[]> r = new ArrayList<>();

		if(intervals == null || intervals.length == 0) {
			return r.toArray(new int[0][]);
		}

		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
		for(int[] i : intervals) {
			System.out.println(i[0]+", "+i[1]);
		}

		int s = intervals[0][0];
		int e = intervals[0][1];

		for(int[] itr : intervals) {
			if(itr[0]<=e) {
				e = Math.max(e, itr[1]);
			}else {
				r.add(new int[] {s,e});
				s=itr[0];
				e=itr[1];
			}
		}
		
		r.add(new int[] {s,e});
		return r.toArray(new int[0][]);
	}

	public static void main(String[] args) {
		int a[][] = {{1,3},{2,6},{8,10},{15,18}};
		int b[][] = merge(a);
		System.out.println("------------------------");
		for(int[] i : b) {
			System.out.println(i[0]+", "+i[1]);
		}
	}

}
