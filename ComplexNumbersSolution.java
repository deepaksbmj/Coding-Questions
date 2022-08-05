package com.practice;

import java.util.Scanner;

class ComplexNumbers {
	private int r;
    private int i;
    
    
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

    public ComplexNumbers(int r, int i) {
		super();
		this.r = r;
		this.i = i;
	}
    
	public ComplexNumbers() {
	}
	
	public String plus(ComplexNumbers c1,ComplexNumbers c2){
        int real  = c1.r+c2.r;
        int imag = c1.i+c2.i;
        return real+" + i"+imag;
    }
	
    public String multiply(ComplexNumbers c1, ComplexNumbers c2){
    	int real = c1.r*c2.r - c1.i*c2.i;
        int imag = (c1.i*c2.r) + (c1.r*c2.i);
        return real+" + i"+imag;
    }
}

public class ComplexNumbersSolution {

	public static void main(String args[]) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(r1,i1);
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(r2,i2);
        int opr= sc.nextInt();
        
        ComplexNumbers result = new ComplexNumbers();
	    if(opr == 1){
            System.out.println(result.plus(c1,c2));
        }else{
            System.out.println(result.multiply(c1,c2));
        }
	}

}
