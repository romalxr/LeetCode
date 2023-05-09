package daily.may.problem_1572;

public class Main {
    public static void main(String[] args) {
        int[][] mat;
        mat = new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(new Solution().diagonalSum(mat));
        mat = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new Solution().diagonalSum(mat));
        mat = new int[][] {{5}};
        System.out.println(new Solution().diagonalSum(mat));
    }
}
