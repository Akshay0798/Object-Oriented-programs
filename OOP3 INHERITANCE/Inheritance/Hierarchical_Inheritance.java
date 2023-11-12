package Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        YY object10=new YY();
        ZZ object20 = new ZZ();

        object10.Super();
        object10.Subclass1();

        object20.Super();
        object20.Subclass2();
    }
}
class XX {
    void Super(){
        System.out.println("Names");
    }
}
class YY extends XX {
    void Subclass1(){
        System.out.println("Akshay");
    }
}
class ZZ extends XX {
    void Subclass2(){
        System.out.println("Suppu");
    }

}
