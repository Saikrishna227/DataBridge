package com.databridge.exercises.day3;

public class StaticInitializationDemo {
    
    static int count = 10;
    static{
        System.out.println("Static block 1 : " + count);
        count+=5;
    }
    static{
        System.out.println("Static block 2 : " + count);
        count*=2;
    }

    {
        System.out.println("Instanc block 1 :" + count);
    }

    {
        System.out.println("Instance block 2 " );
        count++;
    }

    StaticInitializationDemo(){
        System.out.println("constructor executed" + count);
    }
}
