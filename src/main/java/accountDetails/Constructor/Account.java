package accountDetails.Constructor;

public class Account {
    String accountNumber;
    double balance;
    static String bankName;

    //Constructor
   public Account(String accountNumber, double balance, String bankName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        Account.bankName = bankName;
    }

    public Account(){
       this("NULL", 0.0, "test");


    }
}
