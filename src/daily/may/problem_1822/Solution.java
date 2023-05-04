package daily.may.problem_1822;

class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
