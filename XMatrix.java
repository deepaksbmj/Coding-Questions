package com.practice;

public class XMatrix {

public static boolean checkXMatrix(int[][] grid) {
	int r = grid[0].length;
	for(int i=0;i<r;i++) {
		for(int j=0;j<r;j++)
		{
			
			if(i==j && grid[i][j] == 0) {
				return false;
			}else if ((i + j) == (r - 1) && grid[i][j] == 0) {
				return false;
			}
			else if(i!=j && grid[i][j]!=0 && (i + j) != (r - 1) && grid[i][j] != 0) {
				return false;
			}
		}
	}
	return true;
        
    }
	public static void main(String[] args) {
		int a[][] = {{5,0,0,1},{0,4,1,5},{0,5,2,0},{4,1,0,2}};
		System.out.println(checkXMatrix(a));

	}

}
