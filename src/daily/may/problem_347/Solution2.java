package daily.may.problem_347;

import java.util.*;

class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>
                ((a,b) -> Integer.compare(b[0], a[0]));

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            heap.offer(new int[] { entry.getValue(), entry.getKey() });
            // if (heap.size() > k) {
            //     heap.poll();
            // }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.remove()[1];
        }
        return ans;
    }
}
