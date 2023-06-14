package daily.june.problem_1232;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] first = coordinates[0];
        int[] second = coordinates[1];

        int dx = second[0] - first[0];
        int dy = second[1] - first[1];

        double d = dx == 0 ? 100000.0 :
                dy == 0 ? 200000 :
                        1.0 * dx / dy;

        for (int i = 2; i < coordinates.length; i++) {
            int[] now = coordinates[i];
            dx = now[0] - first[0];
            dy = now[1] - first[1];

            double d2 = dx == 0 ? 100000.0 :
                    dy == 0 ? 200000 :
                            1.0 * dx / dy;

            if (d2 != d) return false;
        }

        return true;
    }
}
