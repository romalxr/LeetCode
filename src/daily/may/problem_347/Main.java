package daily.may.problem_347;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] { 1,1,1,2,2,3 };
        //System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));
        nums = new int[] { 1 };
        //System.out.println(Arrays.toString(solution.topKFrequent(nums, 1)));
        nums = new int[] { -1,1,4,-4,3,5,4,-2,3,4,-1 };
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 3)));
    }
}
