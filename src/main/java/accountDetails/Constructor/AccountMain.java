package accountDetails.Constructor;

public class AccountMain {
    public static void main(String[] args) {

        //Account A1 = new Account("98765", 138.22, "ICICI Bank");
        Account A1 = new Account();
        System.out.println("Account Number: " + A1.accountNumber);
        System.out.println("balance : " + A1.balance);
        System.out.println("bankName : " + A1.bankName);


    }
}
