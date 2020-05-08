public class MainClass {
    public static void main(String ...args) {
//        Q904_Solution solutions = new Q904_Solution();
//        solutions.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4});
//        Q1245_SO so = new Q1245_SO();
//
//        int res = so.treeDiameter(new int[][]{{0,1},{0,2}});
//        System.out.println("res: " + res);

//        Q227_SO so = new Q227_SO();
//
//        System.out.println("res: " + so.calculate("1-1+1"));

//        Q207_SO so = new Q207_SO();
//
//        System.out.println("res: " + so.canFinish(2, new int[][] {{1,0}}));
//
//        Q560 so = new Q560();
//        int res = so.subarraySum(new int[] {1,1,3,1,1}, 5);

//        LeftMostColumnIndexOfOne so = new LeftMostColumnIndexOfOne();
////        int res = so.getLeftMostColumnIndex(new int[][] {{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 1}});
////        int res = so.getLeftMostColumnIndex(new int[][] {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
//        int res = so.getLeftMostColumnIndex(new int[][] {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});

//        TreeNode head = new TreeNode(7);
//        TreeNode node1 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(15);
//        TreeNode node3 = new TreeNode(9);
//        TreeNode node4 = new TreeNode(20);
//        head.left = node1;
//        head.right=node2;
//        node2.left = node3;
//        node2.right = node4;
//
//        TreeIterator it = new TreeIterator(head);
//        print("it.hasNext()", it.hasNext()); // true
//        print("it.next()", it.next()); // 3
//        print("it.next()", it.next()); // 7
//        print("it.next()", it.next()); // 9
//        print("it.next()", it.next()); // 15
//        print("it.hasPrev()", it.hasPrev()); // true
//        print("it.prev()", it.prev()); // 9
//        print("it.hasPrev()", it.hasPrev()); // false because we can only move 1 step back
//        print("it.next()", it.next()); // 15
//        print("it.next()", it.next()); // 20
//        print("it.hasNext()", it.hasNext()); // false
//        print("it.hasPrev()", it.hasPrev()); // true
//        print("it.prev()", it.prev()); // 15
//        print("it.hasNext()", it.hasNext()); // true
//        print("it.next()", it.next()); // 20

//        CountSort countSort = new CountSort();
//        int[] nums = new int[] {10,20,21,30,15,19,16,22,22,20,21,19,30};
//        countSort.countSort(nums, 10, 30);
//        for (int i : nums) {
//            print("num", i);
//        }

//        RadixSort radixSort = new RadixSort();
//        int[] nums = new int[] {10,20,21,30,15,19,16,22,22,20,21,19,30, 100, 101, 1, 5,80000};
//        radixSort.radixSort(nums);
//        for (int i : nums) {
//            print("num", i);
//        }
        QuickSort quickSort = new QuickSort();
        int[] nums = new int[] {10,20,21,30,15,19,16,22,22,20,21,19,30, 100, 101, 1, 5,80000};
        quickSort.quickSort(nums);
        for (int i : nums) {
            print("num", i);
        }
    }

    private static void print(String des, Object res) {
        System.out.println(des + " : " + res);
    }
}
