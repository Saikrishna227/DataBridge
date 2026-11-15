package com.databridge.exercises.day4;

public class InheritenceInitializationDemo {

    static int parentStatic = 10;
    static{
        System.out.println("Parent SIB: " + parentStatic);// Parent SIB: 10
        parentStatic+= 20;//30
    }
    int parentValue = 100;
    {
        System.out.println("Parent IIB:  " + parentValue);
        parentValue+= 50;
    }

    public InheritenceInitializationDemo(int amount){
        System.out.println("Constructor executed: " + amount );
    }
}
