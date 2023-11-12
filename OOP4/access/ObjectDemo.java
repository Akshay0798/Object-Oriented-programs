package access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }
    //unique representation of object by number
    @Override
    public int hashCode() {
        return super.hashCode();
        //return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //its for string representation
    @Override
    public String toString() {
        return super.toString();
    }
    //its use when garbage collection hit
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
