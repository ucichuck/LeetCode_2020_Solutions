import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q23_Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists == null) return  null;
      if (lists.length == 1) return lists[0];

        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.val == o2.val) return 0;
            return o1.val < o2.val ? -1 : 1;
        });

        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }

        ListNode pre = new ListNode(1);
        ListNode preHead = pre;
        while (!queue.isEmpty()) {
            ListNode cur = queue.poll();
            pre.next = cur;
            pre = cur;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }

        int[][] slots1 = new int[2][2];
        Arrays.sort(slots1, (o1, o2) -> o1[0] - o2[0]);


        return preHead.next;
    }
}
