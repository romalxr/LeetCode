package binsearch.problem_981;

public class Main {
    public static void main(String[] args) {

        TimeMap timeMap = new TimeMap();
        timeMap.set("ctondw", "ztpearaw", 1);
        timeMap.set("vrobykydll", "hwliiq", 2);
        timeMap.set("gszaw", "ztpearaw", 3);
        timeMap.set("ctondw", "gszaw", 4);
        System.out.println(timeMap.get("gszaw", 5));
        System.out.println(timeMap.get("ctondw", 6));
        System.out.println(timeMap.get("ctondw", 7));
        System.out.println(timeMap.get("gszaw", 8));
    }
}
