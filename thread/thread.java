public class thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker("Worker‑A"));
        Thread t2 = new Thread(new Worker("Worker‑B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads have finished.");
    }
}
class Worker implements Runnable {
    private final String name;
    Worker(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%s: iteration %d%n", name, i);
            try {
                Thread.sleep(200); // simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
