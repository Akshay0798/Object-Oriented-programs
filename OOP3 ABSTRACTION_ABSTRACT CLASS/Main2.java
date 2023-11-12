public class Main2 {
    public static void main(String[] args) {
        Jiraf obj1 = new Jiraf();
        Lion obj2 = new Lion();

         obj1.eating();
         obj2.eating();

    }
}
abstract class Animal{
//    Animal(){ //non abstract method
//        System.out.println("All animal");
//    }
     public abstract void eating();
}
class Jiraf extends Animal{
//    Jiraf(){
//        super();
//        System.out.println("jiraf called");
//    }

    public void eating(){
        System.out.println("vegetarian - eat leaves");
    }

}
class Lion extends Animal{
//    Lion(){
//        super();
//        System.out.println("Lion called");
//    }
    public void eating(){
        System.out.println("non vegetarian - eat animals");
    }
}
