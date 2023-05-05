package binsearch.problem_436;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] intervals = {{1,4}, {2,3}, {3,4}};
        System.out.println(Arrays.toString(new Solution().findRightInterval(intervals)));
    }
}
