package daily.may.problem_24;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode node = newHead;
        while (true) {
            ListNode a = node.next;
            if (a == null) break;
            ListNode b = a.next;
            if (b == null) break;

            a.next = b.next;
            b.next = a;
            node.next = b;
            node = a;
        }
        return newHead.next;
    }
}