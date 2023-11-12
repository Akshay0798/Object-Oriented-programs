package access;

public class Superclass_A {
    protected int num;
    private int number;
    String nav;
    int[] array;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Superclass_A(int num, String name) {
        this.number = num;
        this.nav = name;
        this.array = new int[num];
    }
}
