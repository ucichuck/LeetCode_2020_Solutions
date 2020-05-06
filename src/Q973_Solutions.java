import com.oracle.tools.packager.Log;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Q973_Solutions {
    public int[][] kClosest(int[][] points, int K) {
        if (points.length == 0 || K == points.length) return points;
        kcl(points, 0, points.length -1, K);
//        printArray(points);
        return Arrays.copyOfRange(points, 0, K);
    }

//    private void printArray(int[][] points) {
//        for (int i = 0; i < points.length; i++) {
//            System.out.println(String.valueOf(points[i][0]) + " " + String.valueOf(points[i][1]));
//        }
//    }

    private void kcl(int[][] points, int left, int right, int K) {
        int pivotIndex = ThreadLocalRandom.current().nextInt(left, right);
        int pivotDiff = getDiff(points[pivotIndex][0], points[pivotIndex][1]);

//        System.out.println("pivotIndex: " + pivotIndex + "  pivotDiff: " + pivotDiff);

        int start = left;
        int end = right;
        swap(points, start, pivotIndex);
        start++;
        while (start <= end) {
//            System.out.println("strat: " + start + "  end: " + end);
            if (getDiff(points[start][0], points[start][1]) <= pivotDiff) {
                start ++;
            } else {
                swap(points, start, end);
                end --;
            }
        }

        swap(points, left, end);

        int num = end - left + 1;
        if (num == K) {
            return;
        } else if (num < K) {
            kcl(points, end + 1, right, K - num);
        } else {
            kcl(points, left, end, K);
        }
    }

    private int getDiff(int x, int y) {
        return x*x + y*y;
    }

    private void swap(int[][] points, int i, int j) {
        int t0 = points[i][0], t1 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = t0;
        points[j][1] = t1;
    }
}
