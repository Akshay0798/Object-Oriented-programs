package Lambda_Expression;
@SuppressWarnings("ALL")

/*
interface Demo{
    void method();

}
class Akshay implements Demo{
    @Override
    public void method(){
        System.out.println("i am method");
    }
}
public class Main {
    public static void main(String[] args) {
        Akshay obj = new Akshay();
        obj.method();
    }
}
*/
//----------------------------------------------------------------------------
/*
without creating a new class
Anonymous class

interface Demo2 {
    void method();
}
public class Main {
    public static void main(String[] args) {
        Demo2 obj = new Demo2() {
            @Override
            public void method() {
                System.out.println("i m normal");
            }
        };
        obj.method();
    }
}
*/
//--------------------------------------------------------------------------
//only one interface needed
@FunctionalInterface
interface LambdaDemo{
    void method1();
//    void method2();
//    void method3(int a);
}
public class Main {
    public static void main(String[] args) {
        LambdaDemo obj1 = ()-> {
            System.out.println("i m lambda expression");
        };
        obj1.method1();

//        LambdaDemo obj2 = ()-> { System.out.println("i m lambda expression in a single line"); };
//        obj2.method2();
//
//        LambdaDemo obj3 = (a)-> { System.out.println("i m lambda expression from method2 " + a); };
//        obj3.method3(10);
    }
}

