
//https://leetcode.com/discuss/interview-question/341247/Facebook-or-Phone-screen-or-Leftmost-column-index-of-1
//        In a binary matrix (all elements are 0 and 1), every row is sorted in ascending order (0 to the left of 1).
//        Find the leftmost column index with a 1 in it.
//
//        Example 1:
//
//        Input:
//        [[0, 0, 0, 1],
//        [0, 0, 1, 1],
//        [0, 1, 1, 1],
//        [0, 0, 0, 0]]
//        Output: 1
//        Example 2:
//
//        Input:
//        [[0, 0, 0, 0],
//        [0, 0, 0, 0],
//        [0, 0, 0, 0],
//        [0, 0, 0, 0]]
//        Output: -1
//        Expected solution better than O(r * c).
public class LeftMostColumnIndexOfOne {
    public int getLeftMostColumnIndex(int[][] nums) {
        int res = 0;
        if (nums.length == 0 || nums[0].length == 0) {
            return res;
        }

        int key = Integer.MAX_VALUE;
        for (int[] num : nums) {
            int left = 0;
            int right = num.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (num[mid] == 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                    key = Math.min(key, mid);
                }
            }
        }
        if (key == Integer.MAX_VALUE) return -1;
        return key;
    }
}
