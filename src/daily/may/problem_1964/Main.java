package daily.may.problem_1964;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] { 3,1,5,6,4,2 };
        System.out.println(Arrays.toString(new Solution()
                .longestObstacleCourseAtEachPosition(nums)));
    }
}
