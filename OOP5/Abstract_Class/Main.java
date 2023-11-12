package Abstract_Class;

public class Main {
    public static void main(String[] args) {
        Son obj = new Son(25);
        System.out.println(obj.age);

        obj.carrier("Developer");
        obj.partner("Suppu",27);
        obj.hobbies();

        Parent.Hie();
    }
}
