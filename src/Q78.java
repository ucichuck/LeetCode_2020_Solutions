import java.util.ArrayList;
import java.util.List;

class Q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        if (nums.length == 0) {
            return res;
        }
        
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for (int j = 0; j < res.size(); j++) {
                List<Integer> listTmp = new ArrayList<Integer>();
                listTmp.addAll(res.get(j));
                tmp.add(listTmp);
            }
            int cur = nums[i];
            
            for (List<Integer> list : tmp) {
                list.add(cur);
                res.add(list);
            }
        }
        
        return res;
    }
}
