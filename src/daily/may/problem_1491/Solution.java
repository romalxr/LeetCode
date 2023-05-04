package daily.may.problem_1491;

class Solution {
    public double average(int[] salary) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int i : salary) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        sum -= max;
        sum -= min;
        int count = salary.length - 2;
        return sum / count;
    }
}
