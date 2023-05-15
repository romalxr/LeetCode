package daily.may.problem_1721;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode aNode = head;
        ListNode bNode = head;

        int n = 0;
        ListNode node = head;
        while (node != null) {
            n++;
            if (n == k) {
                aNode = node;
            } else if (n > k) {
                bNode = bNode.next;
            }
            node = node.next;
        }

        int buff = aNode.val;
        aNode.val = bNode.val;
        bNode.val = buff;

        return head;
    }
}
