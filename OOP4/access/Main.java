package access;

public class Main {
    public static void main(String[] args) {
        Superclass_A obj = new Superclass_A(10,"Akshay");
        //need to do few things
        //1. access the data member
        //2. modify the data member

        //private we can access by getter and setter method
        obj.setNumber(100);
        System.out.println(obj.getNumber());

    }
}
