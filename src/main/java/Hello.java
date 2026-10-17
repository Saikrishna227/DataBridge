public class Hello {
    public static void main(String[] args){

        person p = new person();
        p.name = "Krish";
        change(p);
        System.out.println(p.name);


    }
    static void change(person p){
        p.name = "test";
        person p2 = p;
        p2 = new person();
        p2.name = "under p2";

    }
}
