package accountDetails.StaticVsInstanceVariable;

public class Account {
    String accountHolder = "sai";
    double balance;

    public static void display(Account account){
        System.out.print("Account Holder name : " + account.accountHolder);

    }

}
