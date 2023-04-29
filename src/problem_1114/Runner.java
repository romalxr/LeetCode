package problem_1114;

public class Runner implements Runnable{

    private final String jobName;

    public Runner(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(jobName + " is done!");
    }
}
