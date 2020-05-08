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
