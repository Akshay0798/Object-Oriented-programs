package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList_Lambda {
    public static void main(String[] args) {
/*
    Use a lambda expression in the ArrayList's forEach() method to print every item in the list:

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
*/

//------------------------------------------------------------------------------------------------
/*
    Lambda expressions can be stored in variables if the variable's type is an interface which has only
    one method. The lambda expression should have the same number of parameters and the same return
    type as that method. Java has many of these kinds of interfaces built in, such as the Consumer
    interface (found in the java.util package) used by lists.
*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }
}


