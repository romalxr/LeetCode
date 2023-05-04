package unsorted.problem_56;

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for (int[] interval : intervals) {
            int[] last = merged.get(merged.size() - 1);
            if (last[1] < interval[0]) {
                merged.add(interval);
            } else {
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}