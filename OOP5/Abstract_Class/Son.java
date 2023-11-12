package Abstract_Class;

public class Son extends Parent {
    public Son(int Age){
        this.age=Age;
    }
    @Override
    void carrier(String name) {
        System.out.println("I am going to be " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I Love " + name + " ,Her age " + age);
    }

    @Override
    void hobbies() {
        System.out.println("I Love watching Suppu Overactions");
    }

    @Override
    void normal() {
        super.normal();
    }
}
