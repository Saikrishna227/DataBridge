package methodRef;

public class MethodRef {

    static void change(person p){
        //p.name = "test";
        p = new person();
        p.name = "krishna";
        System.out.println(p.name);

    }
    public static void main(String[] args){

        person p = new person();
        p.name = "Sai";
        change(p);
        System.out.println(p.name);

    }
}

class person{
    String name;
    int age;
}


