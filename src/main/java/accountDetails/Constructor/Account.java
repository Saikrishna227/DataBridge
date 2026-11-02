package accountDetails.Constructor;

public class Account {

    String accountNumber;
    String accountHolder;
    double balance;
    static String bankName = "ICICI";

    //no arg constructor
    public Account(){

        this("UNKNOWN","not assigned", 0.0);
    }

    //Constructore with accountNumber, accountHolder
    public Account (String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    //contructore that accepts accountNumber, accountHolder, balance
    public Account(String accountNumber, String accountHolder, double balance){
        this(accountNumber, accountHolder);
        this.balance = balance;
    }

    //constructor that accepts accountNumber, accountHolder, balance, bankName
    public Account (String accountNumber, String accountHolder, double balance, String bankName){
        this(accountNumber,accountHolder,balance);
        Account.bankName = bankName;
    }

}

