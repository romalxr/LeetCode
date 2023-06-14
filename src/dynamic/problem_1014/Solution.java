package dynamic.problem_1014;

class Solution {
    public int maxScoreSightseeingPair(int[] values) {

        int n = values.length;
        int[] numsUp = new int[n];
        int[] numsDown = new int[n];

        for (int i = 0; i < values.length; i++) {
            numsUp[i] = values[i] + i;
            numsDown[i] = values[i] - i;
        }

        int maxFirst = 0;
        int maxSum = numsUp[0];
        for (int i = 0; i < numsUp.length; i++) {
            maxSum = Math.max(maxSum, maxFirst + numsDown[i]);
            maxFirst = Math.max(maxFirst, numsUp[i]);
        }

        return maxSum;
    }
}
