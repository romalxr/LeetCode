package daily.may.problem_1557;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> llist = List.of(
                List.of(0, 1),
                List.of(0, 2),
                List.of(2, 5),
                List.of(3, 4),
                List.of(4, 2));

        System.out.println(solution.findSmallestSetOfVertices(6, llist));

        llist = List.of(
                List.of(0, 1),
                List.of(2, 1),
                List.of(3, 1),
                List.of(1, 4),
                List.of(2, 4));

        System.out.println(solution.findSmallestSetOfVertices(5, llist));
    }
}
