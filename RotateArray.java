package com.practice;

public class RotateArray {

	public static void rotate(int[][] matrix) {
		int r = matrix.length;
		int a[][] =new int[r][r];
		for(int i = 0; i<r;i++) {
			for(int j =0;j<r;j++) {
				a[j][r-i-1]=matrix[i][j];
			}
		}
		
		for(int i = 0; i<matrix.length;i++) {
			for(int j =0;j<matrix[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void rotate1(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		rotate1(matrix);
		System.out.println("---------------------------");
		for(int i = 0; i<matrix.length;i++) {
			for(int j =0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
