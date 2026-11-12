package com.databridge.account;

public class AccountMain {

    static{
        System.out.println("above main");
    }

    public static void main(String[] args) {



        // Exception handling if we pass the non valid arguments
//        try {
//            Account A1 = new Account("1001", "sai", 123.50);
//            System.out.println("account A1"+ A1);
//        }catch (IllegalArgumentException e){
//            System.out.println( e.getMessage());
//        }
//        try {
//            Account A2 = new Account("", "Krishna", 234.50);
//            System.out.println("account A2"+ A2);
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            Account A3 = new Account("1003", " ", 456.50);
//            System.out.println("account A3"+ A3);
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

        //Java Initialization Order, also commonly described as Java Class and Object Initialization Sequence.
        System.out.println("Count in main : "  + Account.count);
        Account A1 = new Account(199);
        System.out.println("Account 1 balance : " + A1);


        Account A2 = new Account(99);
        System.out.println( "Account 2 balance : " + A2);

    }
}
