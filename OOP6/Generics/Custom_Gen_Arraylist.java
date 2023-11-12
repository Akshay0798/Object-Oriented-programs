package Generics;

import java.util.Arrays;

public class Custom_Gen_Arraylist<T> {
    private Object[] data; // Array to store the elements
    private static int DEFAULT_SIZE = 10; // Default initial size of the array
    private int size = 0; // Current number of elements in the array, also acts as an index

    public Custom_Gen_Arraylist() {
        data = new Object[DEFAULT_SIZE]; // Create a new Object array with the default size
    }

    public void add(T num) {
        if (isFull()) {
            resize(); // If the array is full, resize it to accommodate more elements
        }
        data[size++] = num; // Add the element to the array and increment the size/index
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; // Create a new array with double the size

        // Copy the current items to the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; // Replace the old array with the new resized array
    }

    private boolean isFull() {
        return size == data.length; // Check if the array is full by comparing the size with the array length
    }

    public T remove() {
        T removed = (T) (data[--size]); // Get the last element from the array and decrement the size/index
        return removed; // Return the removed element
    }

    public T get(int index) {
        return (T) data[index]; // Get the element at the specified index
    }

    public int size() {
        return size; // Return the current number of elements in the array
    }

    public void set(int index, T value) {
        data[index] = value; // Set the element at the specified index to the given value
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        Custom_Gen_Arraylist<Integer> list = new Custom_Gen_Arraylist<>();
//
//        // Add elements to the list
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list); // Print the list

        Custom_Gen_Arraylist<String> stringList = new Custom_Gen_Arraylist<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
    }
}
