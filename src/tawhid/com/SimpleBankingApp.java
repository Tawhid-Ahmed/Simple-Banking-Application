package tawhid.com;

import java.util.Scanner;

public class SimpleBankingApp {

    private static Scanner scanner = new Scanner(System.in);
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
                    //createNewAccount();
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
}
