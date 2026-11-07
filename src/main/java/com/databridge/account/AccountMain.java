package com.databridge.account;

public class AccountMain {
    public static void main(String[] args) {

        try {
            Account A1 = new Account("1001", "sai", 123.50);
            System.out.println("account A1"+ A1);
        }catch (IllegalArgumentException e){
            System.out.println( e.getMessage());
        }
        try {
            Account A2 = new Account("", "Krishna", 234.50);
            System.out.println("account A2"+ A2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            Account A3 = new Account("1003", " ", 456.50);
            System.out.println("account A3"+ A3);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
