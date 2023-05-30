package daily.may.problem_705;

public class Main {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(43137);
        obj.add(13140);
        obj.add(53136);
        System.out.println(obj.contains(43137));
        obj.remove(53136);
        System.out.println(obj.contains(53136));
    }
}
