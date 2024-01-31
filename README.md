Simple Banking Application is a Java console application. This application can perform the following 8 operations:
1. Create a new account
2. Display all accounts
3. Update an account
4. Delete an account
5. Deposit an amount into your account
6. Withdraw an amount from your account
7. Search for account
8. Exit 
One can run this application by using the **SimpleBankingApp.java** file which contains the main method and other operational methods. Giving input 1-8 to the console the operation can be performed.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Application Structure:**


BankAccount is the parent class for accounts it has four fields name, number, creationdDate, and balance. **CurrentAccount**, **SalaryAccount**, **SavingsAccount** represent three type of bank account. They are the child class of BankAccount class.
Other than that, these three classes have a field called MIN_BALANCE to apply the condition that each account type may require a minimum balance to open the account and keep it in the account.
SimpleBankingApp class contains the main method and other business logics. Business logic for different operations is performed by different methods.

**createNewAccount():** This method is used to create a new account. First, it asks for which type of account to be created from user. User can choose 1-3 to select a specific type of account.
Then it takes the name and initial balance from the user and checks whether the minimum balance requirement is met or not for that type of account. 
The account number will be auto-generated and the creationDate filed will be filled using the system’s local date during account creation.

**displayAllAccounts():** This method is used to display all the accounts available.

**updateAccount():** It asks for the account number which the user wants to update. Primarily using this operation user can update the account balance. (Updating name and creationDate is comment out, one can also explore this feature by removing the comments character.) 
This method also verifies the minimum balance.

**deleteAccount():** This method can remove an account using the account number.

**depositAmount():** It adds an amount to the account’s existing balance. In this app, the minimum balance to be deposited is 10 credits. It eliminates the negative value addition scenario. 

**withdrawAmount():** It performs subtraction to the account balance after verifying that the minimum balance to keep requirement is fulfilled.

**searchAccount():** This method finds an account with the specific account number.

There are two auxiliary method called **generateAccountNumber** and **getMinimumBalance**. The first one is used to generate incremental account numbers and the second one is used to get the minimum required balance for a specific type of account.
In this application, I also take care of the error handling situation. 

 
