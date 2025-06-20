public class threadSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task("Thread-1"));
        Thread t2 = new Thread(new Task("Thread-2"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main thread finished.");
    }
}
class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(500); // sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
    }
}
