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
                    //displayAllAccounts();
                    break;
                case 3:
                    //updateAccount();
                    break;
                case 4:
                    //deleteAccount();
                    break;
                case 5:
                    //depositAmount();
                    break;
                case 6:
                    //withdrawAmount();
                    break;
                case 7:
                    //searchAccount();
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





}
