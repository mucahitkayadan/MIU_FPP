// User-defined exception for withdrawal amount exceeding balance
package exceptions;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// User-defined exception for balance reaching below $100
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

// CustomerAccount class
class CustomerAccount {
    private String cus_name;
    private int acc_No;
    private double balance;

    // Constructor
    public CustomerAccount(String cus_name, int acc_No, double balance) {
        this.cus_name = cus_name;
        this.acc_No = acc_No;
        this.balance = balance;
    }

    // Method to deposit amount
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    // Method to withdraw amount
    public boolean withdraw(double amount) throws InsufficientBalanceException, MinimumBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds the balance.");
        } else if (balance - amount < 100) {
            throw new MinimumBalanceException("Balance will reach below $100 after withdrawal.");
        } else {
            balance -= amount;
            return true;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
