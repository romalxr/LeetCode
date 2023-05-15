package daily.may.problem_1721;

public class MyLinked {
    private ListNode head;
    private ListNode tail;
    private int size;

    public MyLinked() {
        size = 0;
    }

    public MyLinked(int[] nums) {
        size = 0;
        for (int num : nums) {
            add(num);
        }
    }

    public int size() {
        return size;
    }

    public ListNode head() {
        return head;
    }

    public void add(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
}
