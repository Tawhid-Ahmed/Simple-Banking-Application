package tawhid.com;

//This is a child class of BankAccount class for current account category.
public class CurrentAccount extends BankAccount{

    CurrentAccount(String name, String number, String creationDate,double balance){
        super(name,number,creationDate,balance);
    }

}
