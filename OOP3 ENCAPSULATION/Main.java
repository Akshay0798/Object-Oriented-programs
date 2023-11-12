public class Main {
    public static void main(String[] args) {
        A obj=new A();
        obj.setValue(100);
        System.out.println(obj.getValue());
    }
}
class A{
    private int value; //data hiding

    public void setValue(int x){ //data abstraction
        value=x;
    }
    public int getValue(){
        return value;
    }
}