package access;
//it's about protected
public class Subclass extends Superclass_A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Superclass_A obj=new Subclass(45,"Suppu");
        int y=obj.num;
    }
}
//when we can excess protected
class Subsubclass extends Subclass {
    public Subsubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subsubclass obj = new Subsubclass(30, "AK");
        int n = obj.num;
    }
}
