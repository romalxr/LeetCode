package daily.september.problem_141;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            head = head.next;
            if (!set.add(head)) return true;
        }
        return false;
    }
}
