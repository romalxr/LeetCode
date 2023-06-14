package dynamic.problem_152;

import static utils.Output.Sout;

class Solution {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        int imax = r;
        int imin = r;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i], imax * nums[i]);
            imin = Math.min(nums[i], imin * nums[i]);
            r = Math.max(r, imax);
        }
        return r;
    }
}
