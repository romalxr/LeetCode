package daily.may.problem_59;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int x = 0;
        int y = 0;
        int k = 1;
        int d = 0;

        int[] movX = {1, 0, -1,  0};
        int[] movY = {0, 1,  0, -1};
        int[] borders = {-1, -1, n, n};

        while (k <= n * n) {
            matrix[y][x] = k++;
            if (!canMove(x + movX[d], y + movY[d], borders)) {
                d = (d + 1) % 4;
                borders[d] += movX[d] + movY[d];
            }
            x = x + movX[d];
            y = y + movY[d];
        }
        return matrix;
    }
    boolean canMove(int x, int y, int[] borders) {
        return borders[0] < x &&
                borders[2] > x &&
                borders[1] < y &&
                borders[3] > y;
    }
}
