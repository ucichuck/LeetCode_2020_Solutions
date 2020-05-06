import java.util.ArrayList;

public class Q1245_SO {
    public int treeDiameter(int[][] edges) {
        if (edges.length == 0) return 0;
        TreeNode[] arr = new TreeNode[edges.length + 1];
        for (int i = 0; i < edges.length + 1; i++) {
            arr[i] = new TreeNode(i);
        }

        for (int[] nodes : edges) {
            int nodeA = nodes[0];
            int nodeB = nodes[1];

            TreeNode tnA = arr[nodeA];
            TreeNode tnB = arr[nodeB];
            tnA.adj.add(tnB);
            tnB.adj.add(tnA);
        }

//        for (TreeNode a : arr) {
//            System.out.println("a value: " + a.val );
//            for (TreeNode b : a.adj) {
//                System.out.println("adj value: " + b.val );
//            }
//        }

//        bfs(arr[0]);
        return dfs(bfs(arr[0]));
//        return 0;
    }

    private TreeNode bfs (TreeNode head) {
        ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
        arr.add(head);
        ArrayList<TreeNode> nextArr = new ArrayList<TreeNode>();

        TreeNode deepest = null;
        while (!arr.isEmpty()) {
            TreeNode cur = arr.remove(0);
            cur.visited = true;
            System.out.println("cur value" + cur.val);
            for (TreeNode next : cur.adj) {
                System.out.println("next value" + next.val);
                if (!next.visited) {
                    System.out.println("next value added");
                    nextArr.add(next);
                }
            }
            if (arr.isEmpty()) {
                System.out.println("arr is empty: " + arr.size());
                deepest = cur;
                arr = nextArr;
                System.out.println("arr size: " + arr.size());
                nextArr = new ArrayList<TreeNode>();
                System.out.println("next size: " + nextArr.size());
            }
        }
        System.out.println("bfs result: " + deepest.val);
        return deepest;
    }

    private int dfs (TreeNode head) {
        if (head == null || head.dfsVisited) {
            return 0;
        }

        int res = 0;
        head.dfsVisited = true;
        for (TreeNode node : head.adj) {
            if (!node.dfsVisited) {
                res = Math.max(dfs(node), res);
            }
        }
        return res + 1;
    }

    class TreeNode {
        ArrayList<TreeNode> adj;
        int val;
        boolean visited;
        boolean dfsVisited;
        public TreeNode(int val) {
            this.val = val;
            visited = false;
            dfsVisited = false;
            adj = new ArrayList<TreeNode>();
        }
    }
}
