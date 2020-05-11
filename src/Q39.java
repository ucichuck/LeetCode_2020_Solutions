import java.util.ArrayList;
import java.util.List;

public class Q39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        combine(candidates, target, 0, arr, res);
        return res;
    }

    public void combine(int[] candidates, int target, int index, ArrayList<Integer> arr, List<List<Integer>> res) {

        if (target < 0) {
            return;
        }
        if (index >= candidates.length) {
            return;
        }

        if (target == 0) {
            ArrayList<Integer> tmp = new ArrayList<>();
            System.out.println("target 0, res size: " + res.size());
            System.out.println("index: " + index);
            tmp.addAll(arr);
            for (int key : tmp) {
                System.out.println("tmp value: " + key);
            }
            res.add(tmp);
            return;
        }

        combine(candidates, target, index+1, arr, res);
        arr.add(candidates[index]);
        combine(candidates, target - candidates[index], index, arr, res);
        arr.remove(arr.size() - 1);
    }
}
