import java.util.ArrayList;
import java.util.List;

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

//        TreeNode head = new TreeNode(1);
//        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(3);
//        TreeNode node3 = new TreeNode(4);
//        TreeNode node4 = new TreeNode(5);
//        head.left = node1;
//        head.right=node2;
//        node2.left = node3;
//        node2.right = node4;
//
//        Q297 so = new Q297();
//        String res = so.serialize(head);
//        print("res", res);
//        so.deserialize(res);

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
//        QuickSort quickSort = new QuickSort();
//        int[] nums = new int[] {10,20,21,30,15,19,16,22,22,20,21,19,30, 100, 101, 1, 5,80000};
//        quickSort.quickSort(nums);
//        for (int i : nums) {
//            print("num", i);
//        }

//        Q278 solution = new Q278();
//        solution.firstBad = 7;
//        int res = solution.firstBadVersion(7);
//        print("first bad", res);

//        IntersactionAmongThreeArrays so = new IntersactionAmongThreeArrays();
//        ArrayList<Integer> res = so.findIntersaction(new int[]{1, 5, 7, 2, 2, 8, 3, 3}, new int[]{2, 7, 2, 20, 9, 4, 5, 5}, new int[] {1, 2});
//        for (int key : res) {
//            print("resKey", key);
//        }
//        Q278IsGood solution = new Q278IsGood();
//        solution.firstBad = 0;
//        int res = solution.firstBadVersion(7);
//        print("first bad", res);

//        Q39 so = new Q39();
//        List<List<Integer>> res = so.combinationSum(new int[]{2, 3, 6, 7}, 7);
//        print("res size", res.size());

//        int a = 0;
//        print("a: ", ++a);
//        print("a: ", a++);
//        print("a: ", a++);
//        String s = "";
//        s.equals()


        int[] vector1 = new int[] {0, 1, 0, 0, 5, 0, 0 , 0 ,0 , 0, 9, -9, 1000, 0, 5, 0};
        int[] vector2 = new int[] {0, 2};
        int[] vector3 = new int[] {0, 6, 0, 2, 1, 0, 0 , 9, 0 , -1, 9, 9, 100, 0, 0,  0, -9};

        DotProductOfSparseVector dotProduct = new DotProductOfSparseVector();
        int res1 = dotProduct.dotProduct(vector1, vector2);
        print("res", res1);  // 2
        int res2 = dotProduct.dotProduct(vector1, vector3);
        print("res", res2);  // 100011
        int res3 = dotProduct.dotProduct(vector2, vector3);
        print("res", res3); // 12
        int res4 = dotProduct.dotProduct(vector2, vector1);
        print("res", res4); // 2
        int res5 = dotProduct.dotProduct(vector3, vector1);
        print("res", res5); // 100011

    }


    private static void print(String des, Object res) {
        System.out.println(des + " : " + res);
    }
}
