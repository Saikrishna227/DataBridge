package accountDetails.initial;

public class Account {
    String accountHolder ;
    int accountNum ;
    double balance ;

    static String bankName = "ICICI" ;

    public static void display(Account account){
        System.out.println("Bank Name : " + bankName);
        System.out.println(account.accountHolder); // This line will cause a compilation error because 'this' cannot be used in a static context

    }
}
