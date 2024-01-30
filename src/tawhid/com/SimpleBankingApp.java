package tawhid.com;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleBankingApp {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void main(String [] args){
        int choice;

        do {
            //Adding console option instruction

            System.out.println("Banking Application Menu:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount into your account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for account");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            //switch cases according to option selected by user
            switch (choice) {
                case 1:
                    createNewAccount();
                    break;
                case 2:
                    displayAllAccounts();
                    break;
                case 3:
                    updateAccount();
                    break;
                case 4:
                    deleteAccount();
                    break;
                case 5:
                    depositAmount();
                    break;
                case 6:
                    withdrawAmount();
                    break;
                case 7:
                    searchAccount();
                    break;
                case 8:
                    System.out.println("Exiting the application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

        scanner.close();
    }


    //method for new account creation.
    private static void createNewAccount() {
        //Choosing options for account type
        System.out.print("Enter account type (1. Current, 2. Savings, 3. Salary): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String number = scanner.nextLine();

        System.out.print("Enter account creation date: ");
        String creationDate = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account;
        //switching to appropriate account type
        switch (accountType) {
            case 1:

                account = new CurrentAccount(name, number, creationDate, initialBalance);
                break;
            case 2:

                account = new SavingsAccount(name, number, creationDate, initialBalance);
                break;
            case 3:

                account = new SalaryAccount(name, number, creationDate, initialBalance);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        accounts.add(account);
        System.out.println("Account created successfully!");
        System.out.println("-------------------------------------");
    }

    //method to display all existing accounts
    private static void displayAllAccounts() {
        System.out.println("All Accounts:");
        if(accounts.isEmpty()){
            System.out.println("There is no account to display!!!");
            System.out.println("-------------------------------------");
        }
        //iterate over all accounts in the list and print details of the account.
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.number +"\n Account Holder: " + account.name +
                    "\n Creation Date: "+account.creationDate + "\n Balance: " + account.balance );
            System.out.println("-------------------------------------");
        }
    }


    //method to update an account with specific account number
    private static void updateAccount() {
        System.out.print("Enter account number to update: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.number.equals(accountNumber)) {

                //comment out to enable name and creation date update.

                /*System.out.print("Enter correct name: ");
                account.name = scanner.nextLine();
                System.out.print("Enter correct creation Date: ");
                account.creationDate = scanner.nextLine();*/

                System.out.print("Enter new balance: ");
                double newBalance = scanner.nextDouble();
                account.balance = newBalance;

                System.out.println("Account updated successfully!");
                System.out.println("-------------------------------------");
                return;
            }
        }

        System.out.println("Account not found.");
        System.out.println("-------------------------------------");
    }


    //method to delete an account with specific account number
    private static void deleteAccount() {
        System.out.print("Enter account number to delete: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.number.equals(accountNumber)) {
                accounts.remove(account); //removing the account from the list.
                System.out.println("Account deleted successfully!");
                System.out.println("-------------------------------------");
                return;
            }
        }

        System.out.println("Account not found.");
        System.out.println("-------------------------------------");
    }


    //deposit money to a specific account
    private static void depositAmount() {
        System.out.print("Enter account number to deposit into: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.number.equals(accountNumber)) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.balance += amount; //adding the deposit amount to account.
                System.out.println("Amount deposited successfully!");
                System.out.println("-------------------------------------");
                return;
            }
        }

        System.out.println("Account not found.");
        System.out.println("-------------------------------------");
    }


    //withdraw money from a specific account
    private static void withdrawAmount() {
        System.out.print("Enter account number to withdraw from: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.number.equals(accountNumber)) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();

                if (account.balance >= amount) {
                    account.balance-=amount; //reduce the withdrawal amount
                    System.out.println("Withdrawal successful!");
                    System.out.println("-------------------------------------");
                } else {
                    System.out.println("Insufficient funds!");
                    System.out.println("-------------------------------------");
                }
                return;
            }
        }

        System.out.println("Account not found.");
        System.out.println("-------------------------------------");
    }


    //method to search with account number
    private static void searchAccount() {
        System.out.print("Enter account number to search: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount account : accounts) {
            if (account.number.equals(accountNumber)) {
                System.out.println("Account found:");
                System.out.println("Account Number: " + account.number +"\n Account Holder: " + account.name +
                        "\n Creation Date: "+account.creationDate + "\n Balance: " + account.balance +"\n ------------------------");
                return;
            }
        }

        System.out.println("Account not found.");
        System.out.println("-------------------------------------");
    }








}
