package day6;

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Step " + i);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
    }
}

public class thread_coordination{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start();

        try {
            // Main thread waits for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }

        t2.start(); // t2 starts only after t1 is done
    }
}
