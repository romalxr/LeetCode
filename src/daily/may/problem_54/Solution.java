package daily.may.problem_54;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[n * m];

        int x = 0;
        int y = 0;
        int k = 0;
        int d = 0;
        int[] movX = {1, 0, -1,  0};
        int[] movY = {0, 1,  0, -1};
        int[] borders = {-1, -1, n, m};

        while (k < n * m) {
            result[k++] = matrix[y][x];

            int nx = x + movX[d];
            int ny = y + movY[d];

            if (moveOk(nx, ny, borders)) {
                x = nx;
                y = ny;
            } else {
                d = (d + 1) % 4;
                borders[d] += movX[d] + movY[d];
                x = x + movX[d];
                y = y + movY[d];
            }
        }
        return Arrays.stream(result).boxed().toList();
    }
    boolean moveOk(int x, int y, int[] borders) {
        return borders[0] < x &&
                borders[2] > x &&
                borders[1] < y &&
                borders[3] > y;
    }
}
