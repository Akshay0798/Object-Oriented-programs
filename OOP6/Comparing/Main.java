package Comparing;

public class Main {
    public static void main(String[] args) {
        Student Akshay = new Student(1, 80.80f);
        Student Suppu = new Student(2, 90.90f);

        int comparison = Akshay.compareTo(Suppu);
        if (comparison < 0) {
            System.out.println("Akshay has lower marks than Suppu");
        } else if (comparison > 0) {
            System.out.println("Akshay has higher marks than Suppu");
        } else {
            System.out.println("Akshay and Suppu have the same marks");
        }
    }
}
