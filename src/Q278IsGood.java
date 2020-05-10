public class Q278IsGood {
    int firstBad = 0;
    public int firstBadVersion(int n) {

        return firstB(1, n);
    }

    private int firstB(int left, int right) {
        System.out.println("check, left: " + left + ";  right: " + right);
        if (left == right) {
            return isGood(left) ? -1 : left;
        }

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (isGood(mid)) {
            return firstB(mid + 1, right);
        } else {
            int tmp = firstB(left, mid - 1);
            return tmp < 0 ? mid : tmp;
        }
    }


    private boolean isGood(int index) {
        System.out.println("check, index: " + index + ";  firstBad: " + firstBad);
        if (index < firstBad) {
            return true;
        }
        return false;
    }
}
