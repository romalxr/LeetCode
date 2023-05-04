package unsorted.problem_2659;

import java.util.Arrays;

class Solution2 {
    public long countOperationsToEmptyArray(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        boolean[] used = new boolean[nums.length];
        long res = 0;
        int j = -1;
        for (int min : sorted) {
            do {
                do {
                    j++;
                    if (j == nums.length) {
                        j = 0;
                    }
                } while (used[j]);
                res++;
            } while (min != nums[j]);
            used[j] = true;
        }
        return res;
    }
}
