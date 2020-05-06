import java.util.HashMap;

public class Q904_Solution {
    public int totalFruit(int[] tree) {
        if(tree.length <= 2) return tree.length;

        int start = 0 ;
        int end = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int res = 0;
        while (end < tree.length) {
            int curFruit = tree[end];
            if (map.containsKey(curFruit)) {
                map.put(curFruit, map.get(curFruit) + 1);
            } else {
                if (map.size() == 2) {
                    res = Math.max(res, getCount(map));

                    while (start < end) {
                        int pre = tree[start];
                        int value = map.get(pre);
                        if (value == 1) {
                            map.remove(pre);
                            break;
                        } else {
                            map.put(pre, value - 1);
                        }
                        start ++;
                    }
                }
                    map.put(curFruit, 1);
            }
            end++;
        }
        res = Math.max(res, getCount(map));
        return res;
    }

    private int getCount(HashMap<Integer, Integer> map) {
        int res = 0;
        for (int key : map.keySet()) {
            System.out.println("key: " + key + ";  value: " + map.get(key));
            res += map.get(key);
        }
        System.out.println("end");
        return res;
    }
}
