package Inheritance;
public class Simple_Inheritance{
    public static void main(String[] args) {
        Subclass object=new Subclass();
        object.input();
        object.disc();

    }
}
class Superclass {
    int roll;
    String name;
    int marks;

    void input(){
        System.out.println("Roll , Name , Marks");
    }
}
class Subclass extends Superclass {
    void disc() {
        roll = 1;
        name = "Akshay";
        marks = 100;

        System.out.println(roll +" "+ name +" "+ marks);

    }
}




