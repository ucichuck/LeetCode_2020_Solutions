public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode res = pre;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            pre.next = l1;
        }

        if (l2 != null) {
            pre.next = l2;
        }

        return res.next;
    }
}
