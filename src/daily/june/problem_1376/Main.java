package daily.june.problem_1376;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 6;
        int headId = 2;
        int[] manager = { 2,2,-1,2,2,2 };
        int[] informTime = { 0,0,1,0,0,0 };

        System.out.println(solution.numOfMinutes(n, headId, manager, informTime));


    }
}
