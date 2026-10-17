package accountDetails.initial;

public class AccountMain {
    public static void main ( String[] args){

        Account A1 = new Account();

        A1.accountHolder = "sai";
        A1.accountNum = 11234;
        A1.balance = 5000.50;

        Account.display(A1);

    }

}
