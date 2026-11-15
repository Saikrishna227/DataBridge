package com.databridge.exercises.day4;

public class InheritenceInitializationMain {
    public static void main(String[] args){


        System.out.println("main started");
        SavingsAccount SA = new SavingsAccount();

        System.out.println("Parent SIB : " + InheritenceInitializationDemo.parentStatic);
        System.out.println("Child SIB: " + SavingsAccount.childStatic);
        System.out.println("parent Value: " + SA.parentValue);
        System.out.println("Child Value : " + SA.childValue);

    }
}
