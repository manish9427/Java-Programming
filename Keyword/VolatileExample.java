package Keyword;

public class VolatileExample {
    private volatile boolean flag = true;

    public void run() {
        while (flag) {
            // do work
            System.out.println("Thread is running...");
        }
    }

    public void stop() {
        flag = false;
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        Thread thread = new Thread(() -> example.run());
        thread.start();

        // Simulate some work in the main thread
        try {
            Thread.sleep(1000); // Let it run for a second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        example.stop(); // Stop the thread
        System.out.println("Thread has been stopped.");
    }
}
