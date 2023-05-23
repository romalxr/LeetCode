package daily.may.problem_347;

import java.util.*;

class Solution {
    List<int[]> heap = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {

        for (int num : nums) {
            Integer ind = map.get(num);
            if (ind == null) {
                push_heap(num);
            } else {
                siftUp(ind);
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pop_heap();
        }
        return ans;
    }

    void push_heap(int value) {
        heap.add(new int[] { 0, value } );
        map.put(value, heap.size() - 1);
        siftUp(heap.size() - 1);
    }

    private void siftUp(int pos) {
        heap.get(pos)[0]++;
        int ind;
        while (pos > 0 && heap.get(pos)[0] > heap.get(ind = (pos - 1) / 2)[0]) {
            swap(pos, ind);
            pos = ind;
        }
    }

    private void swap(int pos, int ind) {
        int[] buf = heap.get(pos);
        heap.set(pos, heap.get(ind));
        heap.set(ind, buf);
        map.put(heap.get(pos)[1], pos);
        map.put(heap.get(ind)[1], ind);
    }

    int pop_heap() {
        int ans = heap.get(0)[1];
        map.remove(ans);

        int[] last = heap.get(heap.size() - 1);
        heap.set(0, last);
        map.put(last[1], 0);

        int ind;
        int pos = 0;
        while ((ind = pos * 2 + 1) + 1 < heap.size()) {
            if (heap.get(ind + 1)[0] > heap.get(ind)[0]) {
                ind++;
            }
            if (heap.get(pos)[0] < heap.get(ind)[0]) {
                swap(pos, ind);
                pos = ind;
            } else {
                break;
            }
        }

        heap.remove(heap.size() - 1);
        return ans;
    }
}
