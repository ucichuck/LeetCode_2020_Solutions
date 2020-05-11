import java.util.*;

public class Q314 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        TreeMap<Integer, ArrayList<Integer>> cache = new TreeMap<>();

        verticalTraverse(root, 0, cache);

        for (int key : cache.keySet()) {
            ArrayList<Integer> list = cache.get(key);
            Collections.sort(list);
            res.add(list);
        }
        return res;
    }

    private void verticalTraverse(TreeNode node, int column, TreeMap<Integer, ArrayList<Integer>> cache) {
        if (node == null) {
            return;
        }

        if (!cache.containsKey(column)) {
            cache.put(column, new ArrayList<>());
        }
        ArrayList<Integer> list = cache.get(column);
        list.add(node.val);

        verticalTraverse(node.left, column - 1, cache);
        verticalTraverse(node.right, column + 1, cache);
    }
}
