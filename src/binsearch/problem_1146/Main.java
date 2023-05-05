package binsearch.problem_1146;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        SnapshotArray obj = new SnapshotArray(length);
        obj.set(0, 4);
        obj.set(0, 16);
        obj.set(0, 13);
        sout(obj.snap());
        sout(obj.get(0, 0));
        sout(obj.snap());
    }

    private static void sout(int value) {
        System.out.println(value);
    }
}
