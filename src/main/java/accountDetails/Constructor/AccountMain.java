package accountDetails.Constructor;

public class AccountMain {
    public static void main(String[] args) {
        Account A1 = new Account();
        System.out.println(A1.accountNumber);
        System.out.println(A1.accountHolder);
        System.out.println(A1.balance);
        System.out.println("--------------------------");


        Account A2 = new Account("1001","Sai");
        System.out.println(A2.accountNumber);
        System.out.println(A2.accountHolder);
        System.out.println("--------------------------");


        Account A3 = new Account("1002","krishna",5000.0);
        System.out.println(A3.accountNumber);
        System.out.println(A3.accountHolder);
        System.out.println(A3.balance);
        System.out.println("--------------------------");



        Account A4= new Account("1003","Ravi",8000.0,"HDFC");
        System.out.println(A4.accountNumber);
        System.out.println(A4.accountHolder);
        System.out.println(A4.balance);
        System.out.println(Account.bankName);
        System.out.println("--------------------------");



    }
}
