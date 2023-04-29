package problem_839;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {
                "tars","rats","arts","star"
        };
        int result = solution.numSimilarGroups(strs);
        System.out.println(result);
    }
}
