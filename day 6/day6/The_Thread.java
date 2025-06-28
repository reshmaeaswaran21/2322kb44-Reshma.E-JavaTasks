package day6;

class MyTask implements Runnable {
    String message;

    MyTask(String msg) {
        this.message = msg;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " (" + i + ")");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class The_Thread {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable task1 = new MyTask("Hello from Thread 1");
        Runnable task2 = new MyTask("Hello from Thread 2");

        // Create and start threads
        Thread t1 = new Thread(task1, "T1");
        Thread t2 = new Thread(task2, "T2");

        t1.start();
        t2.start();
    }
}
