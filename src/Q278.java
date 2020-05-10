public class Q278 {
    public int firstBad = 1;

    public int firstBadVersion(int n) {

        return firstBad(1, n);
    }

    public int firstBad(int left, int right) {
        System.out.println("check, left: " + left + ";  right: " + right);
        if (left == right) {
            System.out.println("compare check, left: " + left + ";  right: " + right);
            return isBadVersion(left) ? left : -1;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)) {
                return firstBad(mid+1, right);
            } else {
                int res = firstBad(left, mid - 1);
                if (res < 0) {
                    return mid;
                } else {
                    return res;
                }
            }
        }

        return -1;
    }

    private boolean isBadVersion(int index) {
        if (index >= firstBad) {
            return true;
        }
        return false;
    }
}
