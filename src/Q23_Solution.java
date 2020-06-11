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

        return preHead.next;
    }

//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode res = new ListNode();
//        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
//            @Override
//            public int compare(ListNode o1, ListNode o2) {
//                return o1.val - o2.val;
//            }
//        });
//
//        for (ListNode listNode : lists) {
//            if (listNode!= null) {
//                queue.add(listNode);
//            }
//
//        }
//
//        ListNode head = res;
//        while (!queue.isEmpty()) {
//            ListNode tmp = queue.poll();
//            head.next = tmp;
//            head = tmp;
//            tmp = tmp.next;
//            if (tmp != null) {
//                queue.add(tmp);
//            }
//        }
//
//        return res.next;
//    }
}
