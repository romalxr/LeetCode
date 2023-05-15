package daily.may.problem_1721;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        MyLinked list = new MyLinked(new int[]{ 1,2,3,4,5 });
        ListNode head = solution.swapNodes(list.head(), 1);
        System.out.println(head.string());
    }
}
