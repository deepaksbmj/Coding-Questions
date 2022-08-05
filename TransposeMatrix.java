package com.practice;

public class TransposeMatrix {

	 public static int[][] transpose(int[][] matrix) {
		 int a[][] = new int[matrix[0].length][matrix.length];
		 for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[0].length;j++){
					   a[j][i] = matrix[i][j];
				}
			}
		 return a;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = transpose(a);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
