import java.util.ArrayList;

public class Q207_SO {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        TopNode[] arr = new TopNode[numCourses];
        for (int i = 0; i < numCourses; i++) {
            arr[i] = new TopNode(0);
        }
        for (int[] course : prerequisites) {
            int cur = course[0];
            int dep = course[1];
            arr[dep].next.add(arr[cur]);
            arr[cur].indegree++;
        }

        ArrayList<TopNode> list = new ArrayList<>();
        for (TopNode node : arr) {
            if (node.indegree == 0) {
                list.add(node);
            }
        }

        while (!list.isEmpty()) {
            TopNode cur = list.remove(0);
            ArrayList<TopNode> deps = cur.next;
            cur.next = new ArrayList<TopNode>();
            for (TopNode dep : deps) {
                dep.indegree--;
                if (dep.indegree == 0) {

                    list.add(dep);
                }
            }
        }

        for (TopNode node : arr) {
            if (node.indegree != 0) {
                return false;
            }
        }
        return true;

    }

    class TopNode {
        int indegree;
        ArrayList<TopNode> next;

        public TopNode(int indegree) {
            this.indegree = indegree;
            this.next = new ArrayList<TopNode>();
        }
    }
}
