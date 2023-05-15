package daily.may.problem_1721;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {};
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String string() {
        StringBuilder s = new StringBuilder();
        ListNode node = this;
        while (node != null) {
            s.append(node.val).append(" ");
            node = node.next;
        }
        return s.toString();
    }
}
