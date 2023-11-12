package Inheritance;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C object = new C();
        object.Add();
        object.Sub();
        object.Mul();
        object.Div();

    }
}
class A { //superclass
    int a, b, c;

    void Add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Addition : " + c);
    }
    void Sub() {
        a = 100;
        b = 20;
        c = a - b;
        System.out.println("Subtraction : " + c);
    }
}
class B extends A { //Subclass-1

    void Mul(){
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multiplication : " + c);
    }

}
class C extends B{ //Subclass-2
    void Div(){
        a = 10;
        b = 2;
        c = a * b;
        System.out.println("Division : " + c);
    }
}
