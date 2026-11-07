package com.databridge.account;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance){

        if(accountNumber == null || accountNumber.isBlank()){
            throw new IllegalArgumentException("Account should not be null or empty");
        }

        if(accountHolder == null || accountHolder.isBlank()){
            throw new IllegalArgumentException("Account Holdershould not be null or empty");
        }


        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public String toString(){
        return "Account {" +
                "Account Number : " + accountNumber +
                ", Account Holder : "+ accountHolder +
                ", Balance : " + balance +
                " } ";

    }

}
