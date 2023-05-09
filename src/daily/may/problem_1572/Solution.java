package daily.may.problem_1572;

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int l = 0;
        int r = n - 1;
        int sum = 0;
        int row = 0;
        while (l < r) {
            sum += mat[row][l] + mat[row][r];
            row++;
            l++;
            r--;
        }
        if (l == r) {
            sum += mat[row][l];
            row++;
        }
        l--;
        r++;
        while (l >= 0) {
            sum += mat[row][l] + mat[row][r];
            row++;
            l--;
            r++;
        }
        return sum;
    }
}
