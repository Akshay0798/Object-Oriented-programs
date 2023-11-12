
public class InnerClass {
    static class Test{//now we make this class as a static, now its not dependant object of the class
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
            Test a=new Test("kunal");
            Test b=new Test("rahul");

            System.out.println(a.name);
            System.out.println(b.name);

    }
}
//you can not create a class outside of static it will show error
//when u put class inside inner class it will give error
//when we talk static context we're taking where it is a mention as static