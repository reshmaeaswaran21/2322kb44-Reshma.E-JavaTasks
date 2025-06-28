package day6;

public class thread_extend extends Thread	{
	
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Number: " + i);
	            try {
	                Thread.sleep(500); // optional: pause for 0.5 seconds
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        thread_extend thread = new thread_extend(); // create thread object
	        thread.start();             // start the thread
	    }
	}


