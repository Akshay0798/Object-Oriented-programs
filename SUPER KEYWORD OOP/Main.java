public class Main {
    public static void main(String[] args) {
        B extend =new B();
        extend.show(); // - METHOD


    }
}
class A{ //Superclass
    int a=10;
}
class B extends A{ //Subclass
    int a=20;
    void show(){
        System.out.println(a);
        //if I have to print a=10, we use super keyword
        System.out.println(super.a);
    }
}

//class A{ //Superclass
//    //method
//    void show(){
//        System.out.println("Super class called");
//    }
//}
//class B extends A{ //Subclass
//    void show(){
//        System.out.println("Subclass called");
//        super.show();
//    }
//}

//class A{ //Superclass
//    //constructor
//    A(int a){
//        System.out.println(a);
//    }
//}
//class B extends A{ //Subclass
//    B(){
//        super(100);
//        System.out.println("Subclass called");
//
//    }
//}