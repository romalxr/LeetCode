package daily.may.problem_1799;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int maxScore(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                dp[i][j] = gcd(nums[i], nums[j]);
            }
        }
        Map<String, Integer> map = new HashMap<>();
        String mask = "1".repeat(nums.length);
        return solve(1, nums, dp, map, mask);
    }

    private int solve(int count, int[] nums, int[][] dp, Map<String, Integer> map, String mask){
        int n = nums.length;
        if(count > n / 2) {
            return 0;
        }

        int max = 0;
        String s = count + " " + mask;
        sout("s: " + s);
        Integer value = map.get(s);
        if(value != null) {
            return value;
        }

        for(int i = 0; i < n; i++){
            if (nums[i] == -1) continue;
            int a = nums[i];
            nums[i] =- 1;
            mask = mask.substring(0, i) + '0' + mask.substring(i + 1);
            sout("-fir: " + mask);
            for(int j = i + 1; j < n; j++){
                if(nums[j] == -1) {
                    continue;
                }

                int hcf = dp[j][i];
                int temp = count * hcf;
                int elem = nums[j];
                nums[j] = -1;
                mask = mask.substring(0, j) + '0' + mask.substring(j + 1);
                sout("--bef: " + mask);
                max = Math.max(max, temp + solve(count + 1, nums, dp, map, mask));
                nums[j] = elem;
                mask = mask.substring(0, j) + '1' + mask.substring(j + 1);
                sout("--pos: " + mask);
            }
            nums[i] = a;
            mask = mask.substring(0, i) + '1' + mask.substring(i + 1);
            sout("-aft: " + mask);
        }
        map.put(s, max);
        return max;
    }

    private void sout(String s) {
        //System.out.println(s);
    }

    private int gcd(int x, int y)
    {
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        int r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
