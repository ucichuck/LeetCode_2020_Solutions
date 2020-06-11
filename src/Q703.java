import java.util.Arrays;
import java.util.PriorityQueue;

public class Q703 {
    PriorityQueue<Integer> queue;
    int k;

    public Q703(int k, int[] nums) {
        queue = new PriorityQueue<>((o1, o2)->{return o1 - o2;});
        this.k = k;
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else {
                if (queue.peek() < num) {
                    queue.add(num);
                    queue.poll();
                }
            }
        }
    }

    public int add(int val) {

        if (queue.size() < k) {
            queue.add(val);
        } else {
            if (queue.peek() < val) {
                queue.add(val);
                queue.poll();
            }
        }
        return queue.peek();
    }
}
