package day6;

class TicketCounter {
    private int availableTickets = 5; // total seats

    // Synchronized method to avoid race conditions
    public synchronized void bookTicket(String user, int wantedTickets) {
        System.out.println(user + " is trying to book " + wantedTickets + " ticket(s)...");

        try {
            Thread.sleep(1000); // simulate processing delay
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }

        if (wantedTickets <= availableTickets) {
            availableTickets -= wantedTickets;
            System.out.println("✅ " + user + " successfully booked " + wantedTickets + " ticket(s).");
        } else {
            System.out.println("❌ " + user + ": Not enough tickets available.");
        }

        System.out.println("🎟️ Remaining tickets: " + availableTickets + "\n");
    }
}

class User extends Thread {
    TicketCounter counter;
    String userName;
    int ticketsNeeded;

    User(TicketCounter counter, String userName, int ticketsNeeded) {
        this.counter = counter;
        this.userName = userName;
        this.ticketsNeeded = ticketsNeeded;
    }

    public void run() {
        counter.bookTicket(userName, ticketsNeeded);
    }
}

public class Tickets {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        // Simulate 4 users trying to book
        User u1 = new User(counter, "Dhanu", 2);
        User u2 = new User(counter, "Ravi", 1);
        User u3 = new User(counter, "Meena", 2);
        User u4 = new User(counter, "Arjun", 1);

        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}
