package weekly.contest_359.problem_2831;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < 50000; i++) {
//            nums.add(i);
//        }
//        for (int i = 0; i < 50000; i++) {
//            nums.add(i);
//        }
//        System.out.println(nums.size());

        int[] nums = { 3,1,5,3,1,1 };
        //System.out.println(nums);
        System.out.println(s.longestEqualSubarray(utils.Converter.toList(nums), 0));
    }
}
