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

        Q560 so = new Q560();
        int res = so.subarraySum(new int[] {1,1,3,1,1}, 5);

        System.out.println(res);
    }
}
