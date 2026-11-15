package com.databridge.exercises.day4;

public class SavingsAccount extends InheritenceInitializationDemo{

    static int childStatic = 10;

    static{
        System.out.println("child SIB: " + childStatic);
        childStatic+=20;
    }

    int childValue = 200;

    {
        System.out.println("Inside Child IIB: " + childValue);
        childValue+=150;
    }

    SavingsAccount(){
        this(500);
        System.out.println("Savings Account constructor executed:" + childValue);
    }
    SavingsAccount(int amount){
        super(amount);
        System.out.println("this is under the params constrctor: " + amount);
    }
}
