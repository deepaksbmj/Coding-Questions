package com.practice;

public class MoveNegativeNumbers {
	
	
	public static void main(String[] args) {
	
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
	}

	private static void move(int[] a) {
		int cn = 0,cp =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0)
				cp++;
			else
				cn++;
		}
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]<0 && i<cn)
				i++;
			if(a[j]>=0 && j>=(a.length-cn))
				j--;
			else {
				int t =a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
			
		}
		System.out.println(cp+" - "+cn);
	}

}
