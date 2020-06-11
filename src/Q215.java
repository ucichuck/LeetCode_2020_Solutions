public class Q215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0 || nums.length < k) {
            return 0;
        }

        int size = nums.length;
        return quickSelect(0, size - 1, size - k, nums);
    }

    private int quickSelect(int left, int right, int kthSmallest, int[] nums) {
        if (left == right) {
            return nums[left];
        }

        Random random = new Random();
        int pivot = left + random.nextInt(right - left);
        pivot = partition(left, right, pivot, nums);

        if (pivot == kthSmallest) {
            return nums[pivot];
        } else if (kthSmallest < pivot) {
            return quickSelect(left, pivot - 1, kthSmallest, nums);
        } else {
            return quickSelect(pivot + 1, right, kthSmallest, nums);
        }
    }

    private int partition(int left, int right, int pivot, int[] nums) {
        int key = nums[pivot];
        swap(pivot, right, nums);
        int index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < key) {
                swap(i, index, nums);
                index++;
            }
        }

        swap(index, right, nums);
        return index;

    }

    private void swap(int left, int right, int[] nums) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
