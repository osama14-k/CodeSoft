package Project;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class AtmInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Initial balance

        System.out.println("Welcome to the ATM Interface!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            
            if (choice == 4) {
            	System.out.println("Goodbye !");
            	break;
            }
            

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
