public class Q143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        ListNode cur = mid;
        ListNode post = mid.next;
        cur.next = null;

        while (post != null) {
            ListNode next = post.next;
            post.next = cur;
            cur = post;
            post = next;
        }
        slow.next = null;

        ListNode headCur = head;
        while (headCur != null && cur != null) {
            ListNode headNext = headCur.next;
            ListNode next = cur.next;
            headCur.next = cur;
            cur.next = headNext;
            headCur = headNext;
            cur = next;
        }
    }
}
