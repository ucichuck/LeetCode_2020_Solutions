import java.util.ArrayList;

public class DotProductOfSparseVector {
    public int dotProduct(int[] vector1, int[] vector2) {
        int[][] arr1 = compressSparseVector(vector1);
        int[][] arr2 = compressSparseVector(vector2);

        int start1 = 0;
        int start2 = 0;
        int sum = 0;

        while (start1 < arr1.length && start2 < arr2.length) {
            if (arr1[start1][0] == arr2[start2][0]) {
                sum += arr1[start1][1] * arr2[start2][1];
                start1++;
                start2++;
            } else if (arr1[start1][0] <= arr2[start2][0]) {
                start1++;
            } else {
                start2++;
            }
        }
        return sum;
    }

    private int[][] compressSparseVector(int[] vector) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                int[] tmp = new int[] {i, vector[i]};
                res.add(tmp);
            }
        }
        int[][] aa = new int[res.size()][2];
        return res.toArray(aa);
    }
}
