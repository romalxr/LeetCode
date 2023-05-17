package daily.may.problem_2130;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        int max = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            max = Math.max(max, list.get(i) + list.get(list.size() - 1 - i));
        }
        return max;
    }
}
