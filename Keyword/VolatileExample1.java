public class VolatileExample1 {
    private volatile  boolean flag = true;

    public void run() {
        while (flag) {
            System.out.println("Thread is running...");
        }
    }

    public void stop() {
        flag = false;
    }

    public static void main(String[] args) {
        VolatileExample1 example = new VolatileExample1();
        Thread thread = new Thread(() -> example.run());
        thread.start();

        System.out.println("Thread has started.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        example.stop(); // Stop the thread
        System.out.println("Thread has been stopped.");
    }
}

