import java.util.ArrayList;

public class Q269 {
    class Solution {
        public String alienOrder(String[] words) {
            Node[] table = new Node[26];
            for (String key : words) {
                for (int i = 0; i < key.length(); i++) {
                    char curChar = key.charAt(i);
                    Node curNode = table[curChar - 'a'];
                    if (curNode == null) {
                        curNode = new Node(0, curChar);
                        table[curChar-'a'] = curNode;
                    }
                }
            }
            for (int i = 1; i < words.length; i++) {
                String cur = words[i];
                String pre = words[i-1];
                int index = 0;
                while (index < cur.length() && index < pre.length()) {
                    char curChar = cur.charAt(index);
                    char preChar = pre.charAt(index);
                    if (curChar == preChar) {
                        index++;
                        if (index == cur.length() && index < pre.length()) {
                            return "";
                        }
                    } else {
                        Node curNode = table[curChar - 'a'];
                        Node preNode = table[preChar - 'a'];
                        preNode.next.add(curNode);
                        curNode.indegree +=1;
                        break;
                    }
                }
            }

            ArrayList<Node> arr = new ArrayList<>();
            for (int i = 0; i < table.length; i++) {
                Node cur = table[i];
                if (cur != null && cur.indegree == 0) {
                    arr.add(cur);
                }
            }

            StringBuilder res = new StringBuilder();
            while (!arr.isEmpty()) {
                Node cur = arr.remove(0);
                res.append(cur.value);
                for (int i = 0; i < cur.next.size(); i++) {
                    Node tmp = cur.next.get(i);
                    tmp.indegree -= 1;
                    if (tmp.indegree == 0) {
                        arr.add(tmp);
                    }
                }
            }

            for (int i = 0; i < table.length; i++) {
                Node cur = table[i];
                if (cur != null && cur.indegree != 0) {
                    return "";
                }
            }
            return res.toString();
        }

        class Node {
            int indegree;
            ArrayList<Node> next;
            char value;
            public Node(int indegree, char value) {
                this.value = value;
                this.indegree = indegree;
                next = new ArrayList<Node>();
            }
        }
    }
}
