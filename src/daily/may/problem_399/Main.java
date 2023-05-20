package daily.may.problem_399;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c"));
        double[] values = new double[] {
                2.0,
                3.0 };
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x"));
        System.out.println(Arrays.toString(solution.calcEquation(equations, values, queries)));

        equations = List.of(
                List.of("a", "b"),
                List.of("b", "c"),
                List.of("bc", "cd"));
        values = new double[] {
                1.5,
                2.5,
                5.0 };
        queries = List.of(
                List.of("a", "c"),
                List.of("c", "b"),
                List.of("bc", "cd"),
                List.of("cd", "bc"),
                List.of("bc", "a"));
        System.out.println(Arrays.toString(solution.calcEquation(equations, values, queries)));

    }
}
