package Lambda_Expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambda {
    public static void main(String[] args) {
        // Using lambda function to define a Runnable implementation
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count: " + i);
            }
        };

        // Executing the Runnable
        Thread thread = new Thread(runnable);
        thread.start();
//----------------------------------------------------------------------------------

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using lambda function to define custom sorting behavior
        Collections.sort(names, (a, b) -> a.compareTo(b));
        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println(names); // Output: [Alice, Bob, Charlie, David]


    }
}
