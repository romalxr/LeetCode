package daily.may.problem_1964;

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {

        int[] stack = new int[obstacles.length];
        int[] result = new int[obstacles.length];

        int top = 0;
        stack[top] = obstacles[0];
        result[top] = 1;
        for (int i = 1; i < obstacles.length; i++) {
            if (obstacles[i] >= stack[top]) {
                stack[++top] = obstacles[i];
                result[i] = top + 1;
            } else {
                int ind = searchCeiling(stack, obstacles[i], top);
                stack[ind] = obstacles[i];
                result[i] = ind + 1;
            }
        }
        return result;
    }

    public int searchCeiling(int[] nums, int target, int high) {

        //int index = -1;
        int low = 0;
        //int high = nums.length - 1;

        while (low < high) {
            int mid = low  + ((high - low) / 2);
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }
}
