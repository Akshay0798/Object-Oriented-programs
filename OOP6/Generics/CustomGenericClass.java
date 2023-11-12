package Generics;

public class CustomGenericClass<T> {
    private T data; // Private member variable of type T

    public CustomGenericClass(T data) {
        this.data = data; // Constructor to set the value of data
    }

    public T getData() {
        return data; // Getter method to retrieve the value of data
    }

    public void setData(T data) {
        this.data = data; // Setter method to modify the value of data
    }

    public static void main(String[] args) {
        // Create an instance of CustomGenericClass with an Integer type
        CustomGenericClass<Integer> intObject = new CustomGenericClass<>(42);
        int intData = intObject.getData(); // Retrieve data of Integer type
        System.out.println("Integer data: " + intData);

        // Create an instance of CustomGenericClass with a String type
        CustomGenericClass<String> stringObject = new CustomGenericClass<>("Hello, World!");
        String stringData = stringObject.getData(); // Retrieve data of a String type
        System.out.println("String data: " + stringData);
    }
}
/*
        The CustomGenericClass<T> class is declared as a generic class, where T is a type parameter representing a
        generic type that can be replaced with any valid Java type.

        The class has a private member variable data of type T, which will hold the generic data.

        The constructor CustomGenericClass(T data) is used to initialize the data variable with the provided value.

        The getData() method is a getter method that returns the value of the data variable.

        The setData(T data) method is a setter method that sets the value of the data variable.

        In the main method, an instance of CustomGenericClass is created with the type parameter Integer.
        Value 42 is passed to the constructor, setting the data to an integer.

        The getData() method is called on the intObject to retrieve the data,
        which is then stored in an int variable intData.

        The value of intData is printed to the console, indicating that it is integer data.

        Similarly, another instance of CustomGenericClass is created with the type parameter String.
        The value "Hello, World!" is passed to the constructor, setting the data to a string.

        The getData() method is called on the stringObject to retrieve the data,
        which is then stored in a String variable stringData.

        The value of stringData is printed to the console, indicating that it is string data.
*/

