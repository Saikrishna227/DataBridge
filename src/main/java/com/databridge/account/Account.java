package com.databridge.account;

public class Account {
    private String accountNumber;
    private String accountHolder;
    //private double balance;

    // Verifying the account number, account holder and balance and throwing the error
//    public Account(String accountNumber, String accountHolder, double balance){
//
//        if(accountNumber == null || accountNumber.isBlank()){
//            throw new IllegalArgumentException("Account should not be null or empty");
//        }
//
//        if(accountHolder == null || accountHolder.isBlank()){
//            throw new IllegalArgumentException("Account Holdershould not be null or empty");
//        }
//
//
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//
//    }
//    public String toString(){
//        return "Account {" +
//                "Account Number : " + accountNumber +
//                ", Account Holder : "+ accountHolder +
//                ", Balance : " + balance +
//                " } ";
//
//    }



   // Day  3:
    //    private double balnce = printMessage(" this is in print message 1 ");
//
//    {
//        System.out.println("IIB 1");
//    }
//
//    private double minimumBalance = printMessage(" this is in print message 2 ");
//
//    {
//        System.out.println("IIB 2");
//    }
//
//    private double printMessage(String Message){
//        System.out.println(Message);
//        return 0;
//    }
    //Java Initialization Order, also commonly described as Java Class and Object Initialization Sequence.

    {
        System.out.println("this is instance block");
    }

    static int count = 10;

    static {
        System.out.println("inside Static block 1");
        System.out.println("Count before static : " + Account.count);

        count += 5;
        System.out.println("Count after static : " + Account.count);

    }



//    public Account(){
//        System.out.println("inside no args Constructor");
//    }

    public Account(double balance){
        this();
        this.balance = balance;
        System.out.println("inside one  args Constructor");
    }

    public String toString(){
        return "Account details { " + balance  + " }";
    }




    //Day 2 - Object Initialization Order I
    double balance = 1000.0;

    {
        System.out.println("Before IIB 1 : " + balance);
        balance+= 500;
        System.out.println("After IIB 1 : " + balance);
    }
    {
        System.out.println("Before IIB2 : " + balance);
        balance *= 2;
        System.out.println("After IIB2 : " + balance);
    }

    public Account()
    {
        System.out.println("inside the no args constructor after IIBs : " + balance);
    }


}
