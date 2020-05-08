//https://leetcode.com/discuss/interview-question/371618/Facebook-or-Onsite-or-Tree-Iterator
//
//        Question:
//        https://leetcode.com/problems/binary-search-tree-iterator
//
//        Follow-up 1:
//        Assume BSTIterator is a library class. You need to extend the functionality of this class by implementing 2 methods:
//
//public boolean hasPrev() {
//        }
//
///** Can only take 1 step back */
//public Integer prev() {
//        }
//        Example:
//
//        7
//        /   \
//        3    15
//        /  \
//        9    20
//
//        ExtendedBSTIterator it = new ExtendedBSTIterator(root);
//        it.hasNext(); // true
//        it.next(); // 3
//        it.next(); // 7
//        it.next(); // 9
//        it.next(); // 15
//        it.hasPrev(); // true
//        it.prev(); // 9
//        it.hasPrev(); // false bacause we can only move 1 step back
//        it.next(); // 15
//        it.next(); // 20
//        it.hasNext(); // false
//        it.hasPrev(); // true
//        it.prev(); // 15
//        it.hasNext(); // true
//        it.next(); // 20
//
//
//
//        Follow-up 2:
//        What if you can move k steps back?

import java.util.ArrayList;
import java.util.Stack;

public class TreeIterator {
    Stack<TreeNode> stack;
    ArrayList<TreeNode> queue;
    boolean backed;

    public TreeIterator(TreeNode root) {
        stack = new Stack<>();
        queue = new ArrayList<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        if (backed) {
            backed = false;
            return queue.get(0).val;
        }
        if (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode next = node.right;
            while (next != null) {
                stack.push(next);
                next = next.left;
            }
            if (queue.size() <= 1) {
                queue.add(node);
            } else {
                queue.remove(0);
                queue.add(node);
            }
            return node.val;
        }
        return -1;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }


    public boolean hasPrev() {
        return queue.size() == 2;
    }

    /** Can only take 1 step back */
    public Integer prev() {
        backed = true;
        return queue.remove(0).val;
    }
}
