package com.practice;

public class Doubled {
	public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n <=1 || n%2 != 0)
        {
            return new int[0];
        }
        int m = (n)/2;
        int c = m;
        int a[] = new int [c];
        for(int i=0;i<c;i++){
            if(changed[i]*2 == changed[m]){
                a[i] = changed[i];
                m++;
            }else{
                return new int[0];
            }
        }
        return a;
    }

	public static void main(String[] args) {
		int a[] = {1,3,4,2,6,8};
		a = findOriginalArray(a);
		for(var i : a) {
			System.out.println(i);
		}
	}

}
