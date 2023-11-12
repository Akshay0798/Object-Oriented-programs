package Lambda_Expression;
/*
    To use a lambda expression in a method, the method should have a parameter with a single-method
    interface as its type. Calling the interface's method will run the lambda expression:
*/
    /* Create a method which takes a lambda expression as a parameter */

        interface StringFunction {
            String run(String str);
        }

        public class Lambda2 {
            public static void main(String[] args) {

                // Create two lambda expressions for StringFunction
                StringFunction exclaim = (s) -> s + "!";
                StringFunction ask = (s) -> s + "?";

                // Call the printFormatted method with different lambda expressions
                printFormatted("Hello", exclaim);
                printFormatted("Hello", ask);
        }
        //Method to print the formatted string
        public static void printFormatted(String str, StringFunction format) {
                // Invoke the run method of the functional interface
                String result = format.run(str);
                System.out.println(result);
            }
        }


