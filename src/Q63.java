//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
//        The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//        Now consider if some obstacles are added to the grids. How many unique paths would there be?
//
//
//
//        An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//
//        Note: m and n will be at most 100.
//
//        Example 1:
//
//        Input:
//        [
//        [0,0,0],
//        [0,1,0],
//        [0,0,0]
//        ]
//        Output: 2
//        Explanation:
//        There is one obstacle in the middle of the 3x3 grid above.
//        There are two ways to reach the bottom-right corner:
//        1. Right -> Right -> Down -> Down
//        2. Down -> Down -> Right -> Right

public class Q63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) {
            return 0;
        }
        int width = obstacleGrid.length;
        int height = obstacleGrid[0].length;
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (obstacleGrid[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    if (i == 0 && j == 0) {
                        arr[i][j] = 1;
                        continue;
                    }
                    if ((i - 1) < 0 ) {
                        arr[i][j] = arr[i][j-1];
                    } else if ((j - 1) < 0) {
                        arr[i][j] = arr[i-1][j];
                    } else {
                        arr[i][j] = arr[i-1][j] + arr[i][j-1];
                    }
                }
            }
        }
        return arr[width-1][height-1];
    }
}
