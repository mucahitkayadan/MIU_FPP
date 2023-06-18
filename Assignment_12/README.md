Assignment 12 - Exceptions
===========================

CustomerAccount Class
---------------------

### Attributes

*   `Cus_name`: The name of the customer (String).
*   `Acc_No`: The account number (int).
*   `Balance`: The current balance of the account (double).

### Methods

*   `public boolean deposit(double amount)`: Used to increase the balance. Returns `true` if the deposit is successful, or `false` for negative input amounts.
*   `public boolean withdraw(double amount)`: Used to reduce the balance. Returns `true` for a successful withdrawal, or `false` if the withdrawal amount exceeds the balance.
*   `public double getBalance()`: Returns the current balance of the account.

Main Class
----------

The project also includes a `Main` class that demonstrates the usage of the `CustomerAccount` class. It showcases depositing, withdrawing, and retrieving the balance from a customer account.

### Usage

1.  Create an instance of the `CustomerAccount` class, providing the customer name, account number, and initial balance.
2.  Use the `deposit` method to increase the balance by a specified amount.
3.  Use the `withdraw` method to decrease the balance by a specified amount.
4.  Use the `getBalance` method to retrieve the current balance.

#### Example:

    
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
      

License
-------

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.