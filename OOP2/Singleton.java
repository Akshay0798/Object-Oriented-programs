public class Singleton {
    public static void main(String[] args) {
        //Abc obj=new Abc();
        // after creating a static will not able to call this obj

        Abc obj1=Abc.getInstance();
        //Abc obj2=new Abc();
        //not posible to call a new object
    }

}
class Abc{
     static Abc obj=new Abc();
      private Abc(){

      }
      public static Abc getInstance(){
          return obj;
      }
}
