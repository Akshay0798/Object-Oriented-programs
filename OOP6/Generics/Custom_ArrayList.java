package Generics;

import java.util.Arrays;

public class Custom_ArrayList {
    //why private bcoz we can change only by method and function
    //by safety we don't want change directly, I will change by get and set method
    private int[] Array;
    private static int DEFAULT_SIZE = 10; //static boz it's not gone depend on object
    private int size = 0; //initial size is zero //it also work as index value

    //Create a constructor
    public Custom_ArrayList() {
        this.Array = new int[DEFAULT_SIZE];
    }
    //if you want to create add method
    public void add(int num) {
        if (isFull()) { //this method showing if array size is full , resize it
            resize();
        }
        Array[size] = num;
        size++;
    }

    private void resize() {
        //its double the size of array after length is full
        int[] temp = new int[Array.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < Array.length; i++) {
            temp[i] = Array[i];
        }
        Array = temp;
    }

    private boolean isFull() {
        return size == Array.length;
    }
    //it will return remove value itself
    public int remove() {
        int removed = Array[size--];
        return removed;
    }

    public int get(int index) {
        return Array[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        Array[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList -> {" + "data =" + Arrays.toString(Array) + ", size = " + size + '}';
    }
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        Custom_ArrayList list =new Custom_ArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);

        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }
        System.out.println(list);


    }
}
