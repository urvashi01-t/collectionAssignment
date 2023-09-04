package BankApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Bank(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account [Account Number=" + accountNumber + ", Account Holder=" + accountHolder + ", Balance=" + balance + "]";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Bank> accountMap = new HashMap<>();
        
        System.out.println("Bank Application");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Check Balance");
        System.out.println("5. List All Accounts");
        System.out.println("6. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    Bank account = new Bank(accountNumber, accountHolder, initialBalance);
                    accountMap.put(accountNumber, account);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depositAccountNumber = scanner.nextInt();
                    Bank depositAccount = accountMap.get(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    Bank withdrawAccount = accountMap.get(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balanceAccountNumber = scanner.nextInt();
                    Bank balanceAccount = accountMap.get(balanceAccountNumber);
                    if (balanceAccount != null) {
                        System.out.println("Balance: " + balanceAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("List of Accounts:");
                    for (Bank acc : accountMap.values()) {
                        System.out.println(acc);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
	}

}

  
