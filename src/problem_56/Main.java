package problem_56;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {
                {15,18},
                {1,3},
                {2,6},
                {8,10}
        };
        int[][] result = solution.merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}