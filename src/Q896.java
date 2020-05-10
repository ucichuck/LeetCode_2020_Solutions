class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 1) {
            return true;
        }
        int isIncrease = 0;
        for (int i = 1; i <= A.length - 1; i++) {
            if (A[i] - A[i-1] == 0) {
                continue;
            } else if (A[i] - A[i-1] > 0) {
                if (isIncrease == 0) {
                    isIncrease = 1;
                } else if (isIncrease == -1) {
                    return false;
                }
            } else {
                if (isIncrease == 0) {
                    isIncrease = -1;
                } else if (isIncrease == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
