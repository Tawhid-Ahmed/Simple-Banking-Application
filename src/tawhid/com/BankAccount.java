package tawhid.com;

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
