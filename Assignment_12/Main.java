package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a CustomerAccount object
        CustomerAccount account = new CustomerAccount("Kayadan", 123456, 500.0);

        // Deposit amount
        account.deposit(200.0);

        try {
            // Withdraw amount
            account.withdraw(300.0);

            // Get current balance
            double balance = account.getBalance();
            System.out.println("Current balance: $" + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
