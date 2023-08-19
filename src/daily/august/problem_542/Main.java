package daily.august.problem_542;

import utils.Output;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = { {0,0,0}, {0,1,0}, {1,1,1} };
        Output.PrintMatrix(s.updateMatrix(matrix));
    }
}
