public class Q25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k<=1) {
            return head;
        }

        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode res = pre;

        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int group = len / k;
        cur = head;

        for (int i=0; i < group; i++) {
            ListNode post = cur.next;
            int count = 1;
            while (post != null) {
                ListNode aa = post.next;
                post.next = cur;
                cur = post;
                post = aa;
                count++;
                if (count == k) {
                    ListNode tmp = pre.next;
                    pre.next = cur;
                    tmp.next = post;
                    pre = tmp;
                    cur = post;
                    break;
                }
            }
        }
        return res.next;
    }
}
