import java.util.HashMap;

public class Q560 {
//    public int subarraySum(int[] nums, int k) {
//        return subSum(nums, k, 0, false);
//    }
//
//    private int subSum(int[] nums, int k, int index, boolean cont) {
//        if (index >= nums.length) {
//            return 0;
//        }
//
//        int sum = 0;
//        if (k == nums[index]) {
//            sum ++;
//        }
//
//        if (cont) {
//            return sum + subSum(nums, k - nums[index], index+1, cont);
//        } else {
//            return sum + subSum(nums, k - nums[index], index+1, !cont) + subSum(nums, k, index+1, cont);
//        }
//    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        int sum = 0;
        int count = 0;
        cache.put(0, 1);
        for (int i=0; i < nums.length; i++) {
            sum += nums[i];
            if (cache.containsKey(sum - k)) {
                count += cache.get(sum - k);
            }

            cache.put(sum, cache.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
