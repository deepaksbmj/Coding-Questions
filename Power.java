package com.practice;

public class Power {

	public static double myPow1(double x, int n) {
		long m = n;
        if(m<0){
            m = -1*m;
        }
		double d = 1.000000;
		while(m>0) {
			if(m%2 ==1){
                d*=x;
                m-=1;
            }else{
                x*=x;
                m=m/2;
            }
		}
        
        if(n<0){
            d= (double)1.0/(double)d;
        }
        return d; 
	}
	
	public static void main(String[] args) {
		System.out.println(myPow1(2.0,7));

	}

}
