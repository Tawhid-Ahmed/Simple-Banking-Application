package tawhid.com;

//This is a child class of BankAccount class for current account category.
public class CurrentAccount extends BankAccount{

    static final double MIN_BALANCE = 1000;
    CurrentAccount(String name, String number, String creationDate,double balance){
        super(name,number,creationDate,balance);
    }

}
