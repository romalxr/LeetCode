package problem_1114;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Runner runner1 = new Runner("Task 1");
        Runner runner2 = new Runner("Task 2");
        Runner runner3 = new Runner("Task 3");

        Thread thread1 = new Thread(() -> {
            try {
                foo.first(runner1);
            } catch (InterruptedException ignored) {}
        });

        Thread thread2 = new Thread(() -> {
            try {
                foo.second(runner2);
            } catch (InterruptedException ignored) {}
        });

        Thread thread3 = new Thread(() -> {
            try {
                foo.third(runner3);
            } catch (InterruptedException ignored) {}
        });

        thread3.start();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
