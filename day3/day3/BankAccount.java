package day3;

public class BankAccount {
    private double balance;

   
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative");
        } else {
            this.balance = initialBalance;
        }
    }

        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

        public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);  // Initial balance of $500

        // Test deposit and withdrawal
        account.deposit(200.00);  // Deposit $200
        account.withdraw(100.00); // Withdraw $100
        account.withdraw(700.00); // Try withdrawing more than the balance

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}

