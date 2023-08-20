package weekly.contest_359.problem_2831;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            map.computeIfAbsent(nums.get(i), l -> new ArrayList<Integer>()).add(i);
        }

        int ans = 0;
        for (var e : map.entrySet()) {
            List<Integer> list = e.getValue();

            int l = 0;
            int pr = list.get(0) - 1;
            int m = 0;
            int sum = 0;
            int max = 0;
            for (Integer r : list) {
                m += r - (pr + 1);
                while (m > k) {
                    sum--;
                    l++;
                    m -= list.get(l) - (list.get(l - 1) + 1);
                }

                sum++;
                max = Math.max(max, sum);
                pr = r;
            }
            ans = Math.max(ans, max);
        }

        return ans;
    }
}
