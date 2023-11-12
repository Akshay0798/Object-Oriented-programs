public class Main {
    public static void main(String[] args) {
        Student Akshay = new Student();//we create a new object

//        Akshay.roll=1;
//        Akshay.name="Suppu";
//        Akshay.marks=100.0f;


//        System.out.println(Akshay);
        System.out.println(Akshay.roll);
        System.out.println(Akshay.name);
        System.out.println(Akshay.marks);
    }
}

//create a class
//for every single student
//this is a template
class Student{
    int roll;
    String name;
    float marks;

    //we need a way to add the value of the above properties object by object
    //we need one way to access every object
    //for an access object inside a template we need "this" function

    Student() { //constructor
        this.roll = 2;
        this.name = "Akshay";
        this.marks = 99.0f;
    }

}


