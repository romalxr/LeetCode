package daily.may.problem_1557;

import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] count = new int[n];
        edges.forEach(e -> count[e.get(1)]++);
        return IntStream.range(0, n).filter(i -> count[i] == 0).boxed().toList();
    }
}
