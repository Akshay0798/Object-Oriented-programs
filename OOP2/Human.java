public class Human {
    //this r instance veriable
    int age;
    String name;
    int salary;
    boolean married;
    //this static is common for all objects(akshu,suppu,msd)
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}

