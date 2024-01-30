package tawhid.com;
//This is the parent class of Account types.
public class BankAccount {
    String name;
    String number;
    String creationDate;
    double balance;

    BankAccount(String name, String number, String creationDate, double balance) {
        this.name = name;
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
    }
}
