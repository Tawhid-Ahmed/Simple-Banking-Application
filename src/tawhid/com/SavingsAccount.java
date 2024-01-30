package tawhid.com;
//This is a child class of BankAccount class for savings account category.
public class SavingsAccount extends BankAccount {

    static final double MIN_BALANCE = 1500;
    SavingsAccount(String name,String number, String creationDate, double balance){
        super(name,number,creationDate,balance);
    }

}
