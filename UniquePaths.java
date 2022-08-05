package com.practice;

public class UniquePaths {
	public static int uniquePaths(int m, int n) {
      return countPaths(0, 0, m, n);
    }
	
	public static int countPaths(int i, int j, int m, int n) {
	      if(i>=m || j>=n)
	    	  return 0;
	      if(i == (m-1) && j == (n-1))
	    	  return 1;
	      else
	    	  return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }
	
	public static int uniquePathsUtilDP(int m, int n, int[][] dp) {
        if(m == 1 || n == 1) return 1;
        if(dp[m][n] != 0)
            return dp[m][n];
        return dp[m][n] = uniquePathsUtilDP(m-1, n, dp) + uniquePathsUtilDP(m, n-1, dp);
    }
    public static int uniquePathsDP(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        return uniquePathsUtilDP(m, n, dp);
                
    }
    
    public static int uniquePaths2(int m, int n) {
    	int t[][] = new int [m+1][n+1];
        return countPaths2(0, 0, m, n, t);
      }
  	
  	public static int countPaths2(int i, int j, int m, int n, int t[][]) {
  	      if(i>=m || j>=n)
  	    	  return 0;
  	      if(i == (m-1) && j == (n-1))
  	    	  return 1;
  	      if(t[i][j] != 0 ) {
  	    	  return t[i][j];
  	      }
  	      else
  	    	  return t[i][j] = countPaths2(i+1, j, m, n, t) + countPaths2(i, j+1, m, n, t);
      }
    
	public static void main(String[] args) {
		System.out.println(uniquePaths2(3, 7));
	}

}
