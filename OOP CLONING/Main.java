import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human akshay = new Human(27, "Suppu");

        //Human supriya=new Human(akshay);
        //System.out.println(supriya.name);

        //cloning means we are creating exact copy of a object
        Human supriya = (Human) akshay.clone();
        //System.out.println(supriya.name);


//Clone() copies the values of an object to another
//If we create another object by new keyword and assign the values of
// another object to this one, it will require a lot of processing on this object.
// So to save the extra processing task we use clone() method.

        System.out.println(Arrays.toString(supriya.arr));
        supriya.arr[0]=100;
        System.out.println(Arrays.toString(supriya.arr));
        //shallow copy
        //supriya will change but akshay will not
        System.out.println(Arrays.toString(akshay.arr));



    }
}
