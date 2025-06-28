package day6;

class Bank {
    private int balance = 1000; // initial balance

    // synchronized method to avoid overdrawing
    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw ₹" + amount + "...");
        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            System.out.println("Transaction interrupted.");
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println(" " + user + " successfully withdrew ₹" + amount);
        } else {
            System.out.println(" " + user + " failed to withdraw ₹" + amount + " (Insufficient funds)");
        }
        System.out.println(" Balance after " + user + "'s transaction: ₹" + balance + "\n");
    }
}

class UserThread extends Thread {
    Bank account; // Changed BankAccount to Bank
    int amount;

    UserThread(Bank account, String name, int amount) { // Changed BankAccount to Bank
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class Banking_app {
    public static void main(String[] args) {
        Bank sharedAccount = new Bank();
        // Simulate 4 users trying to withdraw
        UserThread u1 = new UserThread(sharedAccount, "Alice", 400);
        UserThread u2 = new UserThread(sharedAccount, "Bob", 300);
        UserThread u3 = new UserThread(sharedAccount, "Charlie", 500);
        UserThread u4 = new UserThread(sharedAccount, "Dhanu", 200);
        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}
