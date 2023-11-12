public class Main2 {
    public static void main(String[] args) {
        Object Supriya = new Object();
                    //whenever a new object is created, go inside a constructor[Object()]
                    //Supriya is referenced veriable
        System.out.println(Supriya.SurName);
        Supriya.greeting();

        Supriya.changeName("Umredkar");

        Supriya.greeting();

    }
}

class Object {
    String SurName;


    Object(){
        this.SurName ="Khandavali";
    }

    void greeting(){
        System.out.println("Supriya Surname is " + this.SurName);
    }

    void changeName(String newSurName){
        this.SurName = newSurName;
        System.out.println("Supriya NewSurname is " + this.SurName);
    }
}

