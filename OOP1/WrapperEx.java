import org.w3c.dom.ls.LSOutput;

public class WrapperEx {
    public static void main(String[] args) {
        int a=10;
        Integer num = 45; //this is creat like object

       //u can not change value
//        final int bonus=9;
//        bonus=3;

        final A akshay=new A("suppu");
        akshay.name="Supriya";
        System.out.println(akshay.name);

        //when non-primitive is final u can not reassign it
        //akshay=new A("bhujinanu");

        A obj;
        for (int i = 0; i < 10; i++) {
            obj=new A("Random name");
        }


    }
}
class A{
    //it should be initialized always whie declaring
    final int num=10;
    String name;

    A(String newname){
        System.out.println("object created");
        this.name=newname;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
