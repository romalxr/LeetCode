package dynamic.problem_139;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "catsandog";
        List<String> words = List.of( "cats","dog","sand","and","cat" );
        System.out.println(solution.wordBreak(s, words));
    }
}
