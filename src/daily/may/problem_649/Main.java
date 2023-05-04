package daily.may.problem_649;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("R " + solution.predictPartyVictory("RD"));
        System.out.println("D " + solution.predictPartyVictory("RDD"));
        System.out.println("D " + solution.predictPartyVictory("DDRRR"));
        System.out.println("R " + solution.predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }
}
