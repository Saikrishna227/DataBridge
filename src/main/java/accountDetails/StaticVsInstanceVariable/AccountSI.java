package accountDetails.StaticVsInstanceVariable;

public class AccountSI {
    public static void main(String[] args) {

        Account A1 = new Account();
        A1.balance = 100;

        Account.display(A1);
    }
}

