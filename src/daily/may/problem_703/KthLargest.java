package daily.may.problem_703;

import java.util.*;

class KthLargest {
    private final int k;
    private final Queue<Integer> heap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) add(num);
    }

    public int add(int val) {
        if ( heap.size() < k || val > heap.element() ) heap.add(val);
        if ( heap.size() > k ) heap.poll();

        return heap.element();
    }
}
