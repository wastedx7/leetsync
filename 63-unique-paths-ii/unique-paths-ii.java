class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        
        dp[0] = 1; // Base case: 1 path to the start
        
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) {
                    // If it's an obstacle, there are 0 paths to reach this specific cell
                    dp[j] = 0; 
                } else if (j > 0) {
                    // Otherwise, paths = paths from above (current dp[j]) + paths from left (dp[j-1])
                    dp[j] = dp[j] + dp[j-1];
                }
            }
        }
        
        return dp[n-1];
    }
}