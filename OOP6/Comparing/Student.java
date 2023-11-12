package Comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    //  This is the 'compareTo()' method, which is required to be implemented because
    //  the Student class implements the Comparable interface.
    //  The method compares the current Student object with another Student object (otherStudent).
    //  'Float.compare()' to compare the marks of the current object (this) with the marks of the other object (otherStudent).

    //    The Float.compare(float a, float b) method returns an int value based on the comparison:

    //    If a is less than b, it returns a negative value.
    //    If a is greater than b, it returns a positive value.
    //    If a is equal to b, it returns zero.
    @Override
    public int compareTo(Student otherStudent) {
        return Float.compare(this.marks, otherStudent.marks);
    }
    //toString() -> It returns a string representation of the Student object.
    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Marks: " + marks;
    }
}
