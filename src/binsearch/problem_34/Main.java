package binsearch.problem_34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,4,4,5,5,5,5,5,7,7,7,7,7,7,7,7,7,7,7,8,8,10};
        int target = 7;
        int[] result = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
