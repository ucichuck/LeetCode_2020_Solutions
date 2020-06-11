import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q40 {
    class Solution {
        HashSet<List<Integer>> cache = new HashSet<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> res = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            combine(candidates, target, 0, arr, res);
            return res;
        }

        public void combine(int[] candidates, int target, int index, ArrayList<Integer> arr, List<List<Integer>> res) {

            if (target < 0) {
                return;
            }

            if (target == 0 && !cache.contains(arr)) {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.addAll(arr);
                res.add(tmp);
                cache.add(tmp);
                return;
            }

            if (index >= candidates.length) {
                return;
            }

            combine(candidates, target, index+1, arr, res);
            arr.add(candidates[index]);
            combine(candidates, target - candidates[index], index + 1, arr, res);
            arr.remove(arr.size() - 1);
        }
    }
}
