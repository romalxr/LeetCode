package problem_1114;

class Foo {

    private boolean firstEnds;
    private boolean secondEnds;

    public Foo() {
        firstEnds = false;
        secondEnds = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        firstEnds = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!firstEnds) {
            wait();
        }
        printSecond.run();
        secondEnds = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!secondEnds) {
            wait();
        }
        printThird.run();
    }
}
