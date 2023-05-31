package daily.may.problem_1396;

public class Main {
    public static void main(String[] args) {
        UndergroundSystem undSys = new UndergroundSystem();
        undSys.checkIn(1, "a", 5);
        undSys.checkOut(1, "b", 12);
        System.out.println(undSys.getAverageTime("a", "b"));
    }
}
