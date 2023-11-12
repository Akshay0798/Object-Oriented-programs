package Abstract_Class;

public abstract class Parent {

    int age;
    abstract void carrier(String name);
    abstract void partner(String name, int age);
    abstract void hobbies();

    //can we create static method in abstract class ? Yes we can.
    static void Hie(){
        System.out.println("Hie Bujjinannu");
    }
    void normal(){
        System.out.println("Yo Yo");
    }
}
