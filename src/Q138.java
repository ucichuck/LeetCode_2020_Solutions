public class Q138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }


        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            Node next = cur.next;
            cur.next = copy;
            copy.next = next;
            cur = next;
        }

        cur = head;
        Node res = cur.next;

        while (cur != null) {
            Node rand = cur.random;
            if (rand != null) {
                cur.next.random = rand.next;
            }
            cur = cur.next.next;
        }

        cur = head;
        while (cur != null) {
            Node copyCur = cur.next;
            Node next = cur.next.next;
            cur.next = next;
            if (next != null) {
                copyCur.next = next.next;
            } else {
                copyCur.next = null;
            }
            cur = next;
        }
        return res;
    }
}
